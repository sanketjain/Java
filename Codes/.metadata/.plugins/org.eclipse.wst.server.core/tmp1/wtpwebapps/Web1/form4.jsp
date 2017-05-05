<%@ page import="org.javaiw.model.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="org.javaiw.model.Student" id="student1" scope="session"></jsp:useBean>
<!-- /* added student object into session  */ -->
 
<jsp:setProperty name="student1" property="rollno"  value='<%=Integer.parseInt(request.getParameter("t1")) %>'/>
<jsp:setProperty property="sname" name="student1" value='<%=request.getParameter("t2") %>'/>
<jsp:setProperty property="marks" name="student1" value='<%=Integer.parseInt(request.getParameter("t3")) %>'/>
<!-- /*we got these 3 properties populated by form parameters*/ -->

<a href='Data4.jsp'>Click here to go next</a>
</body>
</html>