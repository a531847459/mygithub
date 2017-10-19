<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
	+ request.getContextPath();
	String url=basePath+"/pages/add.action";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="<%=url%>" method="post">
		<input type="text" name="ename" value="smith"/><br />
		<input type="text" name="sal" value="1820.6"/><br />
		<input type="text" name="age" value="18"/><br />
		<input type="text" name="birthday" value="1992-10-15"/><br />
		<input type="submit" value="发送"/>
	</form>
</body>
</html>