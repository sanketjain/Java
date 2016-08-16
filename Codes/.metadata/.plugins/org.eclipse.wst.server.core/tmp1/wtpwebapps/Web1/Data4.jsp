<%@page import="java.sql.ResultSet" session="true"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

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
		ps1 = con.prepareStatement("select * from courses");
	} catch (SQLException e){e.printStackTrace();}
}
%>

<table border=1 width=80%>
<tr><th>Course Id</th><th>Course Name</th><th>Duration</th><th>Fee</th><th>DELETE</th><th>EDIT</th></tr>
<%
try{
	ResultSet rs = ps1.executeQuery();
	while(rs.next()){
		int cid = rs.getInt(1);
		String cname = rs.getString(2);
		int duration = rs.getInt(3);
		int fee = rs.getInt(4);
%>
<tr><td><%= cid%></td><td><%=cname %></td><td><%=duration%></td><td><%=fee%></td>
<td><a href='DelServ?cid=<%=cid%>onclick='return confirm("Do you really want to delete this row? ")'>Delete row</a></td>
<td><a href='EditServ?cid=<%=cid%>&cname=<%= cname%>&duration=<%=duration %>&fee=<%=fee%>+' onclick='return confirm("Do you really want to edit this row?")'>Edit row data</a></td></tr>

<% 
}	
}catch(SQLException e){
	e.printStackTrace();
	}
%>
</table>
<a href='file4b.html'>Click to move further</a>
</body>
</html>

