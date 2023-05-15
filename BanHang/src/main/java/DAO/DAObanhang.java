package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import JDBCUtil.*;

import model.*;
public class DAObanhang implements DAOinterface<banhang> {

	public static DAObanhang getInstance()
	{
		return new DAObanhang();
	}
	@Override
	public void insert(banhang t) {
		// TODO Auto-generated method stub
	    try {
	    	Connection con = JBDCConnection.getConnection();
	    	String sql = "insert into infouser values (?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getUsername());
			st.setString(2, t.getPassword());
			st.setString(3, t.getPhone());
			st.setString(4, t.getSothich());
			st.setString(5, t.getAbout());
		    
			int check = st.executeUpdate();
			if(check > 0)
			{
				System.out.println("Insert thanh cong");
			}
			else
			{
				System.out.println("Insert that bai");	
			}
		    con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}   
	}

	@Override
	public List<banhang> selectAll() {
		List<banhang> ls = new ArrayList<banhang>();
		
		 try {
		    	Connection con = JBDCConnection.getConnection();
		    	String sql = "select * from infouser";
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs=  st.executeQuery();
				
				while(rs.next())
				{
				   banhang b = new banhang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				   ls.add(b);
				}
			} catch (Exception e) {
				// TODO: handle exception
			    System.out.println("Insert that bai");
				e.printStackTrace();
			}   
		return ls;
	}

	@Override
	public banhang selectbyID(String username) {
		// TODO Auto-generated method stub
		//return null;
		List<banhang> ls = new ArrayList<banhang>();
		
		 try {
		    	Connection con = JBDCConnection.getConnection();
		    	String sql = "select * from infouser where username = ?";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, username);
				ResultSet rs=  st.executeQuery();
				while(rs.next())
				{
				   banhang b = new banhang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				   ls.add(b);
				}
			} catch (Exception e) {
				// TODO: handle exception
			    System.out.println("Insert that bai");
				e.printStackTrace();
			}   
		return ls.get(0);
	}
	
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		  try {
		    	Connection con = JBDCConnection.getConnection();
		    	String sql = "delete from infouser where username = ? ";
				PreparedStatement st = con.prepareStatement(sql);
	            st.setString(1, id);
	            System.out.println(id);
			    int check = st.executeUpdate();
			    if(check > 0)
			    {
			    	System.out.println("Xoa thanh cong");
			    }
			    else
			    {
			    	System.out.println("Xoa khong thanh cong");
			    }
			    con.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			    System.out.println("Insert that bai");
				e.printStackTrace();
			}   		
	}
	@Override
	public void update(banhang t) {
		// TODO Auto-generated method stub
		  try {
		    	Connection con = JBDCConnection.getConnection();
		    	String sql = "update infouser set password = ? , phone = ? , sothich = ? , about = ? where username = ? ";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1,t.getPassword());
				st.setString(2,t.getPhone());
				st.setString(3,t.getSothich());
				st.setString(4,t.getAbout());
				st.setString(5,t.getUsername());
			 
				int check = st.executeUpdate();
				if(check  > 0)
				{
					System.out.println("Cap nhat thanh cong");
				}
				else
				{
					System.out.println("Cap nhat khong thanh cong");
				}
			    con.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			    System.out.println("Insert that bai");
				e.printStackTrace();
			}   	
		
		
	}

}
