package sessionLoginLogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/welcomess"})
public class welcome  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	
	 HttpSession h = req.getSession();
	 String name = "";
	// name = (String) h.getAttribute("username");
	 Object o = h.getAttribute("username");
	 if(o != null)
	 {
		 name = (String)o;
	 }
	 else
	 {
		 resp.sendRedirect("/LoginUseCookie/sessionLogin");
	 }
		
     	p.println("Hello " + name + " ban da dang nhap thanh cong");
     	p.println("<br/> Logout <a href = '/LoginUseCookie/logout'> Log out </a>");
}     
}
