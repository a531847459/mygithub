<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
	+ request.getContextPath();
	String url=basePath+"/pages/showPre.action";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="<%=url%>" method="post">
		<input type="text" name="str" value="mldn"/><br />
		<input type="checkbox" name="tags" value="王者"/>王者<br />
		<input type="checkbox" name="tags" value="荣耀"/>荣耀<br />
		<input type="submit" value="发送"/>
	</form>
</body>
</html>