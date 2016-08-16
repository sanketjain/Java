<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
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
		ps1 = con.prepareStatement("insert into courses values(?,?,?,?)");
	} catch (SQLException e){e.printStackTrace();}
}
%>

<% 
String cid = request.getParameter("t1"); 
String cname = request.getParameter("t2");
String duration = request.getParameter("t3");
String fee = request.getParameter("t4");


try{
	ps1.setInt(1, Integer.parseInt(cid));
	ps1.setString(2, cname);
	ps1.setInt(3,  Integer.parseInt(duration));
	ps1.setInt(4, Integer.parseInt(fee));
	ps1.execute();
%>	
<tr><td>Row inserted successfully</td></tr>

<% } catch (Exception e) {
	e.printStackTrace(); 
%>
<tr><td>Row could not be inserted</td></tr>

<%	} %>

</body>
</html>














