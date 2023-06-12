package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.question;
import DAO.DAOquestion;

/**
 * Servlet implementation class homefoward
 */
@WebServlet("/homefoward")
public class homefoward extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/// TODO Auto-generated method stub
		//doGet(request, response);
		ArrayList<question> arr = DAOquestion.selectAll();
		req.setAttribute("listQ",arr);
		System.out.println("OK");
		RequestDispatcher r = req.getRequestDispatcher("home.jsp");
		r.forward(req, resp);
	}

}
