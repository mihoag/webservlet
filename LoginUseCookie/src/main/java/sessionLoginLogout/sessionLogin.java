package sessionLoginLogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/sessionLogin"})
public class sessionLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		p.println("<form action = '/LoginUseCookie/sessionLogin' method = 'post'>");
		p.println("username <input type = 'text' name = 'username'>");
		p.println("password <input type = 'text' name = 'password'>");
		p.println("<input type = 'submit' value = 'login'>");
		p.println("</form>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		String username = (String) req.getParameter("username");
	    String password = (String) req.getParameter("password");
	     
	     if(username.equals("admin") && password.equals("123456"))
	     {
	    	 HttpSession h  = req.getSession();
	    	 h.setAttribute("username",username);
	          resp.sendRedirect("/LoginUseCookie/welcomess");	 
	     }
	     else
	     {
	    	 resp.sendRedirect("/LoginUseCookie/sessionLogin");
	     }     
	}
}
