package jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {

	public static Connection getMyConnection() throws IOException {
		Properties property = new Properties();
		FileReader reader = new FileReader("C://Deloitte/myproperties.properties");
		property.load(reader);
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		String driver = property.getProperty("driver");
		Connection connection = null;
		try {
			Class.forName(driver); //Load the driver
			connection = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
