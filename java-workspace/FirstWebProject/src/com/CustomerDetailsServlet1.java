package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

/**
 * Servlet implementation class CustomerDetailsServlet1
 */
public class CustomerDetailsServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerDetailsServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String customerName = request.getParameter("CustomerName");
		String customerAddress = request.getParameter("CustomerAddress");
		int customerId = Integer.parseInt(request.getParameter("CustomerId"));
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
        Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
        CustomerDAO customerDAO = new CustomerDAOImpl();
        boolean result = customerDAO.insertCustomer(customer);
        if(result)
        {
        	response.getWriter().println("Your details are inserted"+customerName);
        }
        else
        {
        	response.getWriter().println("Your details couldn't be inserted"+customerName);
        }
        
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("do Get working on behalf of Service");
		String customerName = request.getParameter("CustomerName");
		String customerAddress = request.getParameter("CustomerAddress");
		int customerId = Integer.parseInt(request.getParameter("CustomerId"));
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
        Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
        CustomerDAO customerDAO = new CustomerDAOImpl();
        boolean result = customerDAO.insertCustomer(customer);
        if(result)
        {
        	response.getWriter().println("Your details are inserted"+customerName);
        }
        else
        {
        	response.getWriter().println("Your details couldn't be inserted"+customerName);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is doPost reporting to duty.");
		String customerName = request.getParameter("CustomerName");
		String customerAddress = request.getParameter("CustomerAddress");
		int customerId = Integer.parseInt(request.getParameter("CustomerId"));
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
        Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
        CustomerDAO customerDAO = new CustomerDAOImpl();
        boolean result = customerDAO.insertCustomer(customer);
        if(result)
        {
        	response.getWriter().println("Your details are inserted"+customerName);
        }
        else
        {
        	response.getWriter().println("Your details couldn't be inserted"+customerName);
        }
	}

}
