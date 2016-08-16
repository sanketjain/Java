<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		ps1 = con.prepareStatement("update courses set cname=?,duration=?,fee=? where cid=?");
	} catch (SQLException e){e.printStackTrace();}
}
%>


<%	
int cid = Integer.parseInt(request.getParameter("t1"));
String cname = request.getParameter("t2");
int duration = Integer.parseInt(request.getParameter("t3"));
int fee = Integer.parseInt(request.getParameter("t4"));

try{
	ps1.setInt(4, cid);
	ps1.setString(1, cname);
	ps1.setInt(2, duration);
	ps1.setInt(3, fee);
	ps1.execute();
%>

<tr><td>Row Edited successfully</td></tr>

<%
} catch (SQLException e){
	e.printStackTrace();
	}
%>
//response.setHeader("Refresh", "4;Data");

	
</body>
</html>