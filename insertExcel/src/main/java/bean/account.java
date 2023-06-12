package bean;

public class account {
private int stt;
private String name;
private String pass;

/**
 * 
 */
public account() {
	// TODO Auto-generated constructor stub
}
public account(int stt, String name, String pass) {
	this.stt = stt;
	this.name = name;
	this.pass = pass;
}
public int getStt() {
	return stt;
}
public void setStt(int stt) {
	this.stt = stt;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
