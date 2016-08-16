<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
Connection con;
PreparedStatement ps1;

public void jspInit() {
	try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
	try{
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
		ps1 = con.prepareStatement("delete from courses where cid=?");
	} catch (SQLException e){e.printStackTrace();}
}
%>


<%		
	String cid = request.getParameter("cid");
	try{
		ps1.setInt(1, Integer.parseInt(cid));
		ps1.execute();
		%><b>Row deleted successfully</b><%			
	} catch (SQLException e){
		e.printStackTrace();
		%><b>Row not deleted<b><%	
	}
	response.setHeader("Refresh", "4;Data.jsp");
%>
	
</body>
</html>
