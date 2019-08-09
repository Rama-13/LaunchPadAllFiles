package customer;

import java.io.FileOutputStream;

public class CustomerApp {
	
	
	

	public static void main (String []args)
	{
		Customer cust3 = new Customer(1500, "Rama", "Banglore",15000);
		Customer cust4 = new Customer(150000, "Rama", "Banglore",870);
		Customer cust5 = new Customer(1900, "Rama", "Banglore",90);
		
		System.out.println(cust3);
		System.out.println(cust4);
		System.out.println(cust5);
		cust3.setBill(25);
System.out.println(cust3);
	}

}
