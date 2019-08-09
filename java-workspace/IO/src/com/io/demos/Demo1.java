package com.io.demos;
import java.io.File;
import java.io.IOException;

// Creating files and directories and classifying the directories and files in the folder
public class Demo1 {

	public static void main (String []args) throws IOException
	{
		File f1 = new File ("C:\\Deloitte\\Batch");
		File f = new File("C:\\Deloitte\\Batch\\Batchmates.txt");
		File f2 = new File("C:\\Deloitte\\Batch\\Roommates.txt");
		f2.createNewFile();
		File f3 = new File("C:\\Deloitte\\Batch\\Whatever");
		f3.mkdir();


		System.out.println("A file is created"); 

		if(f1.exists())
		{

			File allFiles[] = f1.listFiles();
			for(File temp :allFiles)
			{
				if(temp.isDirectory())
				{
					System.out.println(temp + " is Directory");	
				}
				else
				{
					System.out.println(temp + " is file");	
				}
			}
		}
		else
		{
			f1.mkdir();
			f.createNewFile();
			System.out.println("Files and Folders are created");


		}




	}
}
