<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jstl/core_rt" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Điền thông tin học sinh</h1>
<form action="homehandle" method = "POST">
<input type = "text" name = "ID" placeholder="Mã số học sinh"> 
<br/>
<br/>
<input type = "text" name = "name" placeholder="Tên học sinh">
<br/>
<br/>
Province: 
<select name = "province">
<c:forEach items="${listPro}" var = "l">
<option value="${l.ID}" >${l.name}</option>
</c:forEach>
</select>
<br/>
<br/>
<input type="submit" value="enter">
</form>
</body>
</html>