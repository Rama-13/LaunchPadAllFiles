package jdbc;


import java.util.Scanner;

public class CustomerchangesApp {

	public static void main (String []args) throws ClassNotFoundException, Exception
	{
		System.out.println("Select an option \n 1.View records \n 2.Insert value \n 3.Delete a customer");
		Scanner scanner1 = new Scanner(System.in);
		int option = scanner1.nextInt();
		JdbcOperations opp = new JdbcOperations();

		if(option ==1)
		{
			opp.viewAllRecords();
		}
		if(option ==2)
		{

			opp.insertRecordsthruPS();
		}
		if(option == 3)
		{
			opp.deleteRecord();
		}

	}


}
