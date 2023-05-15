import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/welcome")
public class welcome extends HttpServlet{
	//super.doPost(req, resp);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		String name = "";
	    Cookie[] arr = req.getCookies();
	    if(arr != null)
	    {
	    for(Cookie c : arr)
	    {
	    	if(c.getName().equals("username"))
	    	{
	    		name = c.getValue();
	    	}
	    }
	    }
	    if(name.equals(""))
	    {
	     resp.sendRedirect("/LoginUseCookie/login");
	    }
	    else
	    {
	    	p.println("Xin chao " + name);
	    }
	}
	
    
}
