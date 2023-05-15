package JDBCConection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
     private static Connection c = null;
     public static Connection getConnection()
     {
    	 try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String user = "root";
            String pass = "leminhhoang";
            String url = "jdbc:mySQL://Localhost:3306/account";
            c = DriverManager.getConnection(url, user, pass);
    		 
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
