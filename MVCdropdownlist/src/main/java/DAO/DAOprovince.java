package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DB.ConnectionMySQL;
import model.province;

public class DAOprovince {
	public static ArrayList<province> selectAll()
	{
	  ArrayList<province> arr = new ArrayList<province>();
	  try {
		Connection c = ConnectionMySQL.getConnection();
		String sql = "select * from province";
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet rs = p.executeQuery();
		while(rs.next())
		{
			arr.add(new province(rs.getString(1), rs.getString(2)));
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
	  return arr;
	}
}
