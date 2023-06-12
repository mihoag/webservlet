<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function display() {
	var xhttp;
    var name = document.myform.name.value;
    var url = "homeControl?name=" + name;
    if(window.XMLHttpRequest)
        {
    	xhttp = new XMLHttpRequest(); 
        }
    else
        {
    	xhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
    xhttp.onreadystatechange= function()
	{
		if (xhttp.readyState == 4)
		{
			var data = xhttp.responseText;
			document.getElementById("p1").innerHTML=data;
		}
			
        
	}
    xhttp.open("POST",url,true);
    xhttp.send();
    
}
</script>
</head>
<body>
<p id = "p1"></p>
<form name = "myform">
<input type="text" name = "name">
<input type = "button"  value = "submit" onclick="display()"> 
</form>


</body>
</html>