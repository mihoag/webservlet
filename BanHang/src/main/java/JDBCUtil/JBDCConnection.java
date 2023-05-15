package JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class JBDCConnection {
private static Connection c=  null;
public static Connection getConnection()
{
	try {
	     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	     String username = "root";
	     String password = "leminhhoang";
	     String url = "jdbc:mySQL://Localhost:3306/banhang";
	     
	     c = DriverManager.getConnection(url, username, password);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return c;
}
public void close()
{
	try {
		if(c != null)
		{
			c.close();
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
