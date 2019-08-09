package com.io.demos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.stream.Stream;
//de serialization

public class Demo6 

{

	public static void main (String []args) throws IOException
	{
		retrieveObjectFromFile();



	}

	private static void retrieveObjectFromFile() throws IOException
	{
		Employee emp = new Employee("Rama",1010);
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream("C:\\Deloitte\\file.txt"));
			System.out.println(stream.readObject().toString());
			stream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}



