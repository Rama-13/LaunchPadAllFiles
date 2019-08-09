package com.deloitte.cms.dao.impl;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String SELECT_CUSTOMER_QUERY = "Select * from hr.customer where customerId = ?";
	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values(?,?,?,?)";
	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customer where customerId = ?";
	private static final String UPDATE_CUSTOMER_QUERY = "update hr.customer set customername = ?,customerAddress = ?,billAmount =? where customerId=?";
	private static final String SEARCH_CUSTOMER_QUERY = "select * from hr.customer where customerId=?";
	private static final String GET_ALL_CUSTOMER_QUERY = "select * from hr.customer";
	Configuration configuration = new Configuration().configure();

	SessionFactory factory =  configuration.buildSessionFactory();
	@Override
	public List<Customer> getAllCustomers() {
/* 	List<Customer>allcustomers = new ArrayList<Customer>();
	Session session = factory.openSession();
	Query query = session.createQuery("from com.deloitte.cms.model.Customer" );
	Iterator<Customer> iterator = query.iterate();
	while(iterator.hasNext())
	{
		Customer c = iterator.next();
		allcustomers.add(c);
	}
		return allcustomers; */
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class); // equivalent to  select * from customer in SQL
	    criteria.add(Restrictions.like("customerAddress", "Pune"));
		return criteria.list();
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		int noofrecords = 0;
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		// TODO Auto-generated method stub
		if (noofrecords == 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//Customer customer1 = (Customer) session.get(Customer.class,new Integer(1));
		//customer1.setCustomerName(customerName);
		//customer1.setCustomerAddress(customerAddress);
		//customer1.setBillAmount(billAmount);
		session.update(customer);
		transaction.commit();
		session.close();
		factory.close();
		return true;
		
		
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		factory.close();
		return true;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		Session session = factory.openSession();
			Customer customer = (Customer) session.get(Customer.class,customerId);
			return customer;

	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Session session = factory.openSession();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		if(customer == null)
			{return false;}
		else
		{
		
		return true;
		}
	}

}
