package control;

import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.userAns;
import DAO.DAOquestion;

/**
 * Servlet implementation class homeHandle
 */
@WebServlet("/homeHandle")
public class homeHandle extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		ArrayList<userAns> arr = new ArrayList<userAns>();
		
		int cnt = DAOquestion.getRowcnt();
		for(int i = 1; i <= cnt; i++)
		{
			if(request.getParameter(i + "") != null)
			{
			      arr.add(new userAns(i, request.getParameter(i+"") ));
			}
			else
			{
				request.setAttribute("msg", "Bạn chưa trả lời hết câu hỏi");
				request.setAttribute("listQ", DAOquestion.selectAll());
				RequestDispatcher r = request.getRequestDispatcher("home.jsp");
				r.forward(request, response);
				return;
			}
		}
		
		request.setAttribute("lsAnsUser", arr);
		request.setAttribute("listQ", DAOquestion.selectAll());
		
   RequestDispatcher h  = request.getRequestDispatcher("result.jsp");
   h.forward(request, response);
	}

}
