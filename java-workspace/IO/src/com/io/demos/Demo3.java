package com.io.demos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Program for file reader
public class Demo3 
{

	public static void main (String[] args) throws IOException
	{
		FileReader fr = new FileReader ("C:\\Deloitte\\file11.txt");
		int i =0;
		while((i = fr.read())!= -1)
		{
			System.out.println((char)i);
		}
		fr.close();

	}


}
