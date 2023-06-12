<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Exercises</h1>

<form action="homeHandle" method = "POST">
<c:forEach items="${listQ}"  var = "l">
   <h3>${l.question}</h3>
   <br/>
   <input type = "radio" name = "${l.number}" value= "A">${l.option1}  <br/>
   <input type = "radio" name = "${l.number}" value= "B">${l.option2}  <br/>
   <input type = "radio" name = "${l.number}" value= "C">${l.option3}  <br/>
   <input type = "radio" name = "${l.number}" value= "D">${l.option4}  <br/>
</c:forEach>

<br/>
<input type = "submit" value = "submit">
</form>
</body>
</html>