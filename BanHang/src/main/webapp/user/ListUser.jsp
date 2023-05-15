<%@page import="com.google.protobuf.Service"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@page import="java.util.List"%>
<%@page import="service.service"%>
<%@page import="model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>

<%
String name = (String)session.getAttribute("name");
%>

<h2>DANH SÁCH NGƯỜI DÙNG cua <%=name%></h2>

<table style="width:100%">
  <tr>
    <th>Username</th>
    <th>Password</th>
    <th>Phone Number</th>
    <th>Hobies</th>
    <th>About</th>
    <th>Chon</th>
  </tr>
 <%
 service s = new service();
 List<banhang> ls = s.selectAll();
 
 for(banhang b : ls)
 {
 %>
 <tr>
    <td><%= b.getUsername()%></td>
    <td><%= b.getPassword()%></td>
    <td><%= b.getPhone()%></td>
    <td><%= b.getSothich()%></td>
    <td><%= b.getAbout()%></td>
    <td><a href="edit.jsp?id=<%=b.getUsername()%>">edit</a> | <a href="delete.jsp?id=<%=b.getUsername()%>">delete</a></td>
  </tr>
  
 <%} %>
</table>
<br/>
<%
Cookie k = new Cookie("name","Trungtamjava");
k.setMaxAge(10);
response.addCookie(k);
%>
<a href="back.jsp">Home</a><br/>
<a href="addUser.jsp">AddUser</a>
</body>
</html>