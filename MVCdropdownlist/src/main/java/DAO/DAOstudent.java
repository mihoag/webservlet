package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DB.ConnectionMySQL;

public class DAOstudent {
 public static void insert(String ID, String name, String pro)
 {
	 try {
		Connection con = ConnectionMySQL.getConnection();
		String sql = "insert into hocsinh values (?,?,?)";
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1, ID);
		p.setString(2, name);
		p.setString(3, pro);
		
		int ck = p.executeUpdate();
		if(ck > 0)
		{
			System.out.println("them thanh cong");
		}
		else
		{
			System.out.println("them that bai");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
 }
}
