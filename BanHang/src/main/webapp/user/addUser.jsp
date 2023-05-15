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
Cookie[] arr = request.getCookies();
String value = "";
for(Cookie k : arr)
{
	if(k.getName().equals("name"))
			{
		 value  = k.getValue();
		        
		}
}
%>
<h1><%=value%> </h1>
<h1>Them nguoi dung moi</h1>

<form action="doPost.jsp" method = "post">
<input name = "name" type = "text" placeholder="Ten nguoi dung"> <br/> 
<input name = "password" type = "password" placeholder="Password" ><br/> 
<input name = "Phone" type = "text" placeholder="So dien thoai" ><br/> 
<input name = "fav1" type = "checkbox" value = "xem phim">Xem Phim
<input name = "fav2" type = "checkbox" value="nghe nhac">Nghe nhac<br/>
<textarea rows="3" cols="20" name = "about" placeholder="Gioi Thieu"></textarea> <br/>
<input type="submit" value="submit"">
</form>
</body>
</html>