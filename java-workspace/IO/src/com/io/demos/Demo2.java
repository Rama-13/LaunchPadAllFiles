package com.io.demos;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//program for FileWriter

public class Demo2 {

	public static void main (String []args) throws IOException 
	{
		FileWriter fw = new FileWriter("C:\\Deloitte\\file11.txt");
		fw.write("Rue rules");
		fw.close();
		System.out.println("Positive Captain");
	}

}

