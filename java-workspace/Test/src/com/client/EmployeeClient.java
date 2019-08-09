package com.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

import com.dao.impl.EmpDAOimpl;
import com.model.Employee;

public class EmployeeClient {
	
	
	
	public static void main(String[] args) {
			
		EmpDAOimpl ed = new EmpDAOimpl();
		
		
		
		
		
		
		
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String Fname = scanner.next();
		System.out.println("Enter the last name");
		String Lastname = scanner.next();
		System.out.println("Enter your Date of Birth dd-MMM-yyyy");
		String dob = scanner.next();
		

		
		
			
		System.out.println("Enter Employee Address");
		String Address = scanner.next();
		
		int num = rand.nextInt(1000);
		String empid = Fname.substring(0,2) + Lastname.substring(0,2)+num;
		System.out.println(empid);
		
		Employee employee = new Employee(Fname,Lastname,empid,dob,Address);
		ed.insertEmployee(employee);
		
	}

}
