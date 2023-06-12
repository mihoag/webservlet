<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript">
function thongbao()
{
	var name = document.myform.name.value;
	
	if (name == null || name == "")
	{
		document.getElementById("p1").innerHTML = "Không được để trống";	
			return false;
	}
    

}

 </script> -->
 
 <script type="text/javascript">
function giaithua() {
	var str = document.formGT.num.value;
	var num = parseInt(str);
	var kq = 1;
	for(var i = 1; i <= num ; i++)
		{
		kq *= i;
		}
	alert("Ket qua " + kq);	
}

 </script>
</head>
<body>

<!--  
<p id = "p1"></p>

<form action="tb" method="POST" onsubmit="return thongbao()" name ="myform">
	
			<input type ="text" name ="name"/>
			<input type ="submit" value ="Xuất thông tin"/>
				
	</form>
-->

 <!-- <form action="tb" method="post"  onsubmit="return thongbao()" name = "myform">
<input type="text" name = "name">
<input type="submit" value="submit" >

</form> -->


<form name = "formGT" onsubmit="return giaithua()">
<input type = "text" name = "num">
<input type = "submit" value = "enter">
</form>
</body>
</html>