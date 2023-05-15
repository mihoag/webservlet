<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.banhang" %>
    <%@ page import="service.service" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("name");
String password = request.getParameter("password");
String phone = request.getParameter("Phone");
String about = request.getParameter("about");
String fav1 = request.getParameter("fav1");
String fav2 = request.getParameter("fav2");
String sothich = "";
if(fav1 != null)
{
	sothich += fav1 + " ";
}
if(fav2 != null)
{
	sothich += fav2;
}
banhang b = new banhang(name,password,phone,sothich,about);
service s = new service();
s.update(b);
response.sendRedirect("/BanHang/user/ListUser.jsp");
%>
</body>
</html>