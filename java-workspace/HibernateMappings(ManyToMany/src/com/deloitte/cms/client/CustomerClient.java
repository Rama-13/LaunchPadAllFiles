package com.deloitte.cms.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;

import org.hibernate.Transaction;

public class CustomerClient {


	public static void main(String[] args) {

		//looks for hibernate.cfg.xml and creates db connection
		Configuration configuration = new Configuration().configure();

		SessionFactory factory =  configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		PremiumCustomer customer = new PremiumCustomer(115,"Rama","Pune",4855);
		customer.setRewardPoints(100);
		
		//Customer customer = (Customer) session.get(Customer.class,9855);
		session.save(customer);
		System.out.println(customer);
		transaction.commit();
		session.close();
		factory.close();


	}
}
