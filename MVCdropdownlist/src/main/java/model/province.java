package model;

public class province {
private String ID;
private String name;
public province(String iD, String name) {
	super();
	ID = iD;
	this.name = name;
}
public province() {
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
}
