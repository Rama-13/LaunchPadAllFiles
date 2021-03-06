package com.deloitte.cms.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.EmployeeDetails;

import org.hibernate.Transaction;

public class CustomerClient {


	public static void main(String[] args) {

		//looks for hibernate.cfg.xml and creates db connection
		Configuration configuration = new Configuration().configure();

		SessionFactory factory =  configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//PremiumCustomer customer = new PremiumCustomer(115,"Rama","Pune",4855);
		Set allAddress = new HashSet();
		EmployeeDetails emp1 = new EmployeeDetails(1,"Rama",5802);
		EmployeeDetails emp2 = new EmployeeDetails(2,"Karthik",5803);
		EmployeeDetails emp3 = new EmployeeDetails(3,"Gavin",5804);


		Address address1 = new Address(1,"Hyd","Telangana");
		Address address2 = new Address(2,"Mumbai","Maharastra");
		Address address3 = new Address(3,"Coimbatore","TamilNadu");

		allAddress.add(address1);
		allAddress.add(address2);
		emp1.setEmployeeAddress(allAddress);
		emp2.setEmployeeAddress(allAddress);
		emp3.setEmployeeAddress(allAddress);
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		System.out.println("Data is saved but I have no idea");
		transaction.commit();
		session.close();
		factory.close();


	}
}
