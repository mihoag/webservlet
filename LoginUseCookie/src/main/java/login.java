import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
        PrintWriter p =resp.getWriter();
        p.println("<form action = '/LoginUseCookie/login' method = 'post' >");
        p.println("User <input type = 'text' name = 'user'>");
        p.println("Password <input type = 'text' name = 'pass'>");
        p.println("<input type = 'submit' value = 'Login'>");
        p.println("</action>");
        
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		
		if(username.equals("minhhoang") && password.equals("123456"))
		{
			Cookie c = new Cookie("username", username);
			c.setMaxAge(60);
			resp.addCookie(c);
			resp.sendRedirect("/LoginUseCookie/welcome");	
		}
		else
		{
		   resp.sendRedirect("/LoginUseCookie/login");	
		}
	}
}

