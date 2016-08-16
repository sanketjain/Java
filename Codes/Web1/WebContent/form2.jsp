<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student1" class="org.javaiw.model.Student" scope="session"></jsp:useBean>
Name=<jsp:getProperty property="sname" name="student1"/>
Marks=<jsp:getProperty property="marks" name="student1"/>
</body>
</html>