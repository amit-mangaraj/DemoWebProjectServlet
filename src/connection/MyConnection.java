package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MyConnection {

	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 System.setProperty("Jdbc.drivers", "com.mysql.jdbc.Driver");
	     Properties properties = new Properties();
	     properties.put("user", "root");
	     properties.put("password", "admin");
	     String url= "jdbc:mysql://localhost:3306/SQLActivity3";
		Connection c=DriverManager.getConnection(url,properties);
		System.out.println("Connection established: "+ c);
		return c;
		
	}
}
