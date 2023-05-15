package model;

public class banhang {
private String username;
private String password;
private String phone;
private String sothich;
private String about;
public banhang() {
	// TODO Auto-generated constructor stub
}
public banhang(String username, String password, String phone, String sothich, String aboun)
{
	this.username = username;
	this.password = password;
	this.phone = phone;
	this.sothich = sothich;
	this.about = aboun;
}
public String getUsername() {
	return username;
}
 
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getSothich() {
	return sothich;
}
public void setSothich(String sothich) {
	this.sothich = sothich;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}
}
