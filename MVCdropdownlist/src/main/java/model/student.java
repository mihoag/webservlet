package model;

public class student {
private String ID;
private String name;
private String pro;
public student(String iD, String name, String pro) {
	super();
	ID = iD;
	this.name = name;
	this.pro = pro;
}
/**
 * 
 */
public student() {
	// TODO Auto-generated constructor stub
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPro() {
	return pro;
}
public void setPro(String pro) {
	this.pro = pro;
}


}
