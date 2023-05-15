package DAO;

import java.util.List;

public interface DAOinterface<T>{
 public void insert(T t);
 public List<T> selectAll();  
 public T selectbyID(String username);  
 public void delete(String id);
 public void update(T t); 
}
