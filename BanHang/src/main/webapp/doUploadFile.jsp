
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
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
String url  = "";
DiskFileItemFactory dis = new DiskFileItemFactory();
dis.setRepository(new File("F:\\HK2_Nam2\\WEBJSPSERVLET\\BanHang\\src\\main\\webapp"));
ServletFileUpload upload = new ServletFileUpload(dis);

List<FileItem>  ls = upload.parseRequest(request);
for(FileItem f : ls)
{
	if(!f.isFormField())
	{
		if(f.getFieldName().equals("file"))
		{
			File file = new File ("F:\\HK2_Nam2\\WEBJSPSERVLET\\BanHang\\src\\main\\webapp\\image" + f.getName()) ;
			f.write(file);
			url = f.getName();
		}
	}
}
%>
<img src = "<%=url%>">
</body>
</html>