package DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import DB.mySQL;
import bean.account;

public class DAOaccount {
   public static void insertData(account ac) throws SQLException
   {
	    String sql ="insert into account values (?,?,?)";
	    Connection con = mySQL.getConnection();
	    
	    PreparedStatement p = con.prepareStatement(sql);
	    p.setInt(1, ac.getStt());
	    p.setString(2, ac.getName());
	    p.setString(3, ac.getPass());
	    
	    int ck = p.executeUpdate();
	    if(ck > 0)
	    {
	    	System.out.println("insert thanh cong");
	    }
	    else
	    {
	    	System.out.println("Insert that bai");
	    }    
   }
   
   public static void importData(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
   {
	   FileInputStream fi;
	   try {
		fi = new FileInputStream("F:\\HK2_Nam2\\WEBJSPSERVLET\\insertExcel\\src\\main\\webapp\\file\\user.xls");
		Workbook wb = new HSSFWorkbook(new POIFSFileSystem(fi));
		
	    Sheet s = wb.getSheetAt(0);
	    for(int i = 1 ; i <= s.getLastRowNum(); i++)
	    {
	    	Row r = s.getRow(i);
	    	int stt = (int) r.getCell(0).getNumericCellValue();
	    	String name = r.getCell(1).getStringCellValue();
	    	String pass = r.getCell(2).getStringCellValue();
	    	
	    	account ac = new account(stt,name,pass);
	    	DAOaccount.insertData(ac);
	    }
	} catch (Exception e) {
		// TODO: handle exception
		request.setAttribute("mess", e.getMessage());
		e.printStackTrace();
	}
	 
	   RequestDispatcher r = request.getRequestDispatcher("result.jsp");
	   r.forward(request, response);
   }
}
