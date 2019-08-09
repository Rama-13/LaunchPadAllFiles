package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentServlet
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	HttpSession session = request.getSession();
	Integer noofProducts = (Integer) session.getAttribute("productcount");
	Integer total = (Integer) session.getAttribute("total");
	String customerName = (String) session.getAttribute("customerName");
	response.getWriter().println("Thanks for Shopping!"+customerName);
	response.getWriter().println("Your total cost is "+total);
	response.getWriter().println("The no.of products purchased is "+noofProducts);
	}

}
