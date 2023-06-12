package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOprovince;
import model.province;

@WebServlet(urlPatterns = "/homefoward")
public class homeFoward extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
    ArrayList<province> arr=  DAOprovince.selectAll();
    req.setAttribute("listPro", arr);
    RequestDispatcher h = req.getRequestDispatcher("home.jsp");
    h.forward(req, resp);
}
}
