package propertiess;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main (String []args) throws IOException
	{
		Properties property = new Properties();

		FileReader reader = new FileReader ("C://Deloitte/myproperties.properties");
		property.load(reader);
		System.out.println(property.get("username"));
		System.out.println(property.get("password"));
		System.out.println(property.get("driver"));
		System.out.println(property.get("url"));


	}

}
