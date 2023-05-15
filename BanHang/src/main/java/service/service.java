package service;

import java.util.List;

import DAO.*;
import model.*;

public class service {
private DAObanhang d;
public service()
{
  d = new DAObanhang();	
}
public List<banhang> selectAll()
{
	return d.selectAll();
}
public banhang selectbyID(String username)
{
     return d.selectbyID(username);    	
}
public void update(banhang b)
{
	d.update(b);
}
public void delete(String id)
{
	d.delete(id);
}
public void insert(banhang b)
{
	d.insert(b);
}

}
