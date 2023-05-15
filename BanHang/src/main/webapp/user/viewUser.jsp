<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
%>

<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>

<h2>Thong tin nguoi dung</h2>

<table style="width:100%">
  <tr>
    <td>Username</td>
    <td><%=name %></td>
  </tr>
 <tr>
    <td>Password</td>
    <td><%=password %></td>
  </tr>
  <tr>
    <td>So dien thoai</td>
    <td><%=phone %></td>
  </tr>
  <tr>
    <td>So thich</td>
    <td><%=sothich %></td>
  </tr>
   <tr>
    <td>about</td>
    <td><%=about %></td>
  </tr>  
</table>
<br/>
<a href="Logout.jsp">Logout</a>
</body>
</html>