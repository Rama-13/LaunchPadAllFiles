package com.deloitte.client;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;


public class CustomerClient {
	public static void main (String []args) throws ClassNotFoundException, Exception
	{
		Scanner scanner1 = new Scanner(System.in);

		CustomerDAOImpl cd = new CustomerDAOImpl();
		while (true) {


			System.out.println("Select an option \n 1.Check for Customer \n 2.Insert value \n 3.Delete a customer \n 4.Update Customer Value \n 5.Search by customerId \n 6.Display all customers \n 7.Exit ");

			int option = scanner1.nextInt();
			if(option ==1)
			{
				
				System.out.println("Enter CustomerId:");
				int customerId = scanner1.nextInt();
				System.out.println(cd.isCustomerExists(customerId) +" Customer Exists");
			}
			if(option ==2)
			{
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the name of customer");
				String customerName = scanner.nextLine();
				System.out.println("Enter customer ID");
				int customerId = scanner.nextInt();
				System.out.println("Enter customer Address");
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br= new BufferedReader(isr);
				String customerAddress= br.readLine();
				System.out.println("Enter Bill Amount");
				int billAmount = scanner.nextInt();
				Customer cust = new Customer(customerId,customerName,customerAddress,billAmount);
				cd.insertCustomer(cust);
			}
			if(option == 3)
			{
				System.out.println("Enter the customerId:");
				int customerId = scanner1.nextInt();
				cd.deleteCustomer(customerId);
			}
			if(option == 4)
			{
				System.out.println("Enter the customerId:");
				int customerId = scanner1.nextInt();
				System.out.println("Enter the name of customer");
				InputStreamReader isr1=new InputStreamReader(System.in);
				BufferedReader br1= new BufferedReader(isr1);
				String customerName= br1.readLine();
				System.out.println("Enter customer Address");
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br= new BufferedReader(isr);
				String customerAddress= br.readLine();
				System.out.println("Enter Bill Amount");
				int billAmount = scanner1.nextInt();
				Customer cust = new Customer(customerId,customerName,customerAddress,billAmount);
				cust.setCustomerId(customerId);
				cust.setCustomerName(customerName);
				cust.setCustomerAddress(customerAddress);
				cust.setBillAmount(billAmount);
				cd.updateCustomer(cust);

			}
			if(option == 5)

			{
				System.out.println("Enter the customer Id");
				int customerId = scanner1.nextInt();
				Customer cust3 = cd.searchCustomerById(customerId);
				System.out.println(cust3);

			}
			if(option == 6)
			{
				List<Customer> allCustomers = cd.getAllCustomers();
				System.out.println(allCustomers);

			}
			if(option ==7)
			{
				System.exit(0);
			}

		}
	}

}
