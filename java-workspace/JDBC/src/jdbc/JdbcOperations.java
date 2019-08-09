package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcOperations {


	public void viewAllRecords() throws ClassNotFoundException, SQLException, IOException {
		Connection connection = DbUtility.getMyConnection(); //Use the connection from DbUtility
		Statement statement = connection.createStatement(); //Create a statement
		ResultSet res = statement.executeQuery("select * from HR.customer");
		ResultSetMetaData rsmd = res.getMetaData();
		int columnno = rsmd.getColumnCount();
		while(res.next())
		{
			for(int i=1;i<=columnno;i++)
			{
				System.out.print(res.getString(i)+" "); // 1 is the column name and to print the next element you need to execute next again.
			}
			System.out.println();
		}
	}

	public void insertRecords() throws ClassNotFoundException, SQLException, IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of customer");
		String customerName = scanner.nextLine();
		System.out.println("Enter customer ID");
		int customerID = scanner.nextInt();
		System.out.println("Enter customer Address");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String customerAddress= br.readLine();
		System.out.println("Enter Bill Amount");
		int billAmount = scanner.nextInt();
		String sql = "insert into hr.customer"+" values ("+customerID +","+"'"+customerName+"'"+","+"'"+customerAddress+"'"+","+billAmount +")";
		System.out.println(sql);
		Connection connection = DbUtility.getMyConnection();
		Statement statement = connection.prepareStatement(sql); //Create a statement
		int noofrecords = statement.executeUpdate(sql);

		{
			System.out.println(noofrecords + " records is/are affected"); 
		}
		viewAllRecords();

	}



	public void insertRecordsthruPS() throws ClassNotFoundException, SQLException, IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of customer");
		String customerName = scanner.nextLine();
		System.out.println("Enter customer ID");
		int customerID = scanner.nextInt();
		System.out.println("Enter customer Address");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String customerAddress= br.readLine();
		System.out.println("Enter Bill Amount");
		int billAmount = scanner.nextInt();
		String sql = "insert into hr.customer values (?,?,?,?)";

		System.out.println(sql);
		Connection connection = DbUtility.getMyConnection();
		PreparedStatement statement = connection.prepareStatement(sql);//Create a statement
		statement.setInt(1, customerID );
		statement.setString(2, customerName);
		statement.setString(3, customerAddress);
		statement.setInt(4, billAmount);
		int noofrecords = statement.executeUpdate();

		{
			System.out.println(noofrecords + " records is/are affected"); 
		}
		viewAllRecords();

	}
	public void deleteRecord() throws SQLException, IOException, ClassNotFoundException
	{
		Connection connection = DbUtility.getMyConnection();
		System.out.println("Enter the customer ID to be deleted");
		Scanner scanner = new Scanner(System.in);
		int custID = scanner.nextInt();	
		String sql = "delete from hr.customer where customerID = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, custID );
		int noofrecords1 = statement.executeUpdate();
		viewAllRecords();





	}


}