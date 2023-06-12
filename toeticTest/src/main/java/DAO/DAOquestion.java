package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import BEAN.question;
import DB.mySQL;

public class DAOquestion {
public static ArrayList<question> selectAll()
{
	ArrayList<question> arr = new ArrayList<question>();
	try {
		String sql = "select * from question";
		Connection con = mySQL.getConnection();
		
		PreparedStatement p = con.prepareStatement(sql);
		ResultSet rs = p.executeQuery();
		while(rs.next())
		{
		   arr.add(new question(rs.getInt(1), rs.getInt(2), rs.getString(3),  rs.getString(4),  rs.getString(5),  rs.getString(6),  rs.getString(7), rs.getString(8)))	;
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return arr;
}



public static int getRowcnt()
{
int cnt= 0;
try {
	String sql = "select count(*) from question";
	Connection con = mySQL.getConnection();
	PreparedStatement p = con.prepareStatement(sql);
	ResultSet rs = p.executeQuery();
	while(rs.next())
	{
	    cnt = rs.getInt(1);
		//arr.add(new question(rs.getInt(1), rs.getInt(2), rs.getString(3),  rs.getString(4),  rs.getString(5),  rs.getString(6),  rs.getString(7), rs.getString(8)))	;
	}
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
  return cnt;
}
}
