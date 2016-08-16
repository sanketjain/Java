<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String dur = request.getParameter("duration");
		String fee = request.getParameter("fee");
		out.println("<form method='post' action='EditServ2'>"
				+ "CourseId<input type='text' name='t1' value='"+cid+"'></br>"
					+ "CourseName<input type='text' name='t2' value='"+cname+"'></br>"
						+ "Duration<input type='text' name='t3' value='"+dur+"'></br>"
							+ "Fee<input type='text' name='t4' value='"+fee+"'></br>"
									+ "<input type='submit' value='Submit'></form>");
%>
	
</body>
</html>