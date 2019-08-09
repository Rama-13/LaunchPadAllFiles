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
import java.util.List;
import java.util.Scanner;
import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String SELECT_CUSTOMER_QUERY = "Select * from hr.customer where customerId = ?";
	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values(?,?,?,?)";
	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customer where customerId = ?";
	private static final String UPDATE_CUSTOMER_QUERY = "update hr.customer set customername = ?,customerAddress = ?,billAmount =? where customerId=?";
	private static final String SEARCH_CUSTOMER_QUERY = "select * from hr.customer where customerId=?";
	private static final String GET_ALL_CUSTOMER_QUERY = "select * from hr.customer";
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers = new ArrayList<Customer>();
		try {
			Connection connection = DbUtility.getMyConnection();
			boolean isUserExists = false;

			PreparedStatement statement = connection.prepareStatement(GET_ALL_CUSTOMER_QUERY);
			ResultSet res = statement.executeQuery();
			while (res.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(res.getInt(1));
				customer.setCustomerName(res.getString(2));
				customer.setCustomerAddress(res.getString(3));
				customer.setBillAmount(res.getInt(4));
				allCustomers.add(customer);
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return allCustomers;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		int noofrecords = 0;
		try {
			Connection connection = DbUtility.getMyConnection();
			PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(3, customer.getCustomerAddress());
			statement.setInt(4, customer.getBillAmount());
			noofrecords = statement.executeUpdate();
			System.out.println("Inserted "+noofrecords+" Succesfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if (noofrecords == 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		int noofrecords = 0;
		// TODO Auto-generated method stub
		try {
			Connection connection = DbUtility.getMyConnection();
			PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setInt(4, customer.getCustomerId());
			statement.setString(1, customer.getCustomerName());
			statement.setString(2, customer.getCustomerAddress());
			statement.setInt(3, customer.getBillAmount());
			noofrecords=statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(noofrecords==0)
		{
			return false;
		}
		else
			return true;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DbUtility.getMyConnection();
			PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			int noofrecords = statement.executeUpdate();
			System.out.println("Deleted "+noofrecords+" Succesfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		if(isCustomerExists(customerId))
		{
			Customer cust1 = new Customer();
			try {
				Connection connection = DbUtility.getMyConnection();

				PreparedStatement statement = connection.prepareStatement(SEARCH_CUSTOMER_QUERY);
				statement.setInt(1,customerId);
				ResultSet rs = statement.executeQuery();
				rs.next();

				String customerName = rs.getString(2);
				String customerAddress = rs.getString(3);
				int billAmount = rs.getInt(4);
				cust1.setCustomerName(customerName);
				cust1.setCustomerAddress(customerAddress);
				cust1.setBillAmount(billAmount);
				cust1.setCustomerId(customerId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return cust1;
			// TODO Auto-generated method stub
		}
		else {


			System.out.println("Customer not found");
			return null;
		}

	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		boolean isUserExists = false;
		try {
			Connection connection = DbUtility.getMyConnection();
			PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			ResultSet res = statement.executeQuery();
			if(res.next())
			{
				isUserExists = true;
				return isUserExists;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
