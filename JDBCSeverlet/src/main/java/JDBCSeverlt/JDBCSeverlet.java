package JDBCSeverlt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import JDBCConection.JDBCConnection;
@WebServlet(urlPatterns = {"/jdbc"})
public class JDBCSeverlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	Connection con = JDBCConnection.getConnection();
	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	
	try {
		Statement st = con.createStatement();
		String sql = "select * from account";
		ResultSet rs = st.executeQuery(sql);
		
		
		while(rs.next())
		{
			p.println("<br/>Ten : " + rs.getString(2) + "  ,Dia chi: " + rs.getString(3));
			//System.out.println("Ten : " + rs.getString(1) + "  ,Dia chi: " + rs.getString(2));
		}
	} catch (Exception e) {
		// TODO: handle exception
	    e.printStackTrace();
	}
	
}
/*public static void main(String[] args) {
	Connection con = JDBCConnection.getConnection();
	//resp.setContentType("text/html");
	//PrintWriter p = resp.getWriter();
	
	try {
		Statement st = con.createStatement();
		String sql = "select * from account";
		ResultSet rs = st.executeQuery(sql);
		
		
		while(rs.next())
		{
			   System.out.println("Ten : " + rs.getString(1) + "  ,Dia chi: " + rs.getString(2));
		}
	} catch (Exception e) {
		// TODO: handle exception
	    e.printStackTrace();
	}
}*/

}
