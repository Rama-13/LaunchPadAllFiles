package com.io.demos;
import java.io.FileOutputStream;
//serializing
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private String empName; int empId;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}


}

public class Demo5 implements Serializable {

	public static void main (String []args) throws IOException
	{

		saveObjectToFile();



	}

	private static void saveObjectToFile() throws IOException
	{
		Employee emp = new Employee("Rama",1010);
		try {
			ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("C:\\Deloitte\\file.txt"));
			stream.writeObject(emp);
			stream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
