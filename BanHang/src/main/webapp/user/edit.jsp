<%@page import="service.service"%>
<%@page import="model.banhang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="service.service" %>
    <%@ page import="model.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
%>
<h3>Sua lai thong tin user co id :  <%=id %></h3>
<form action ="doedit.jsp" method = "post" value = <%=id %>>
<input name = "name" type = "text" placeholder="Ten nguoi dung"> <br/> 
<input name = "password" type = "password" placeholder="Password" ><br/> 
<input name = "Phone" type = "text" placeholder="So dien thoai" ><br/> 
<input name = "fav1" type = "checkbox" value = "xem phim">Xem Phim
<input name = "fav2" type = "checkbox" value="nghe nhac">Nghe nhac<br/>
<textarea rows="3" cols="20" name = "about" placeholder="Gioi Thieu"></textarea> <br/>
<input type="submit" value="submit">
</form>
</body>
</html>