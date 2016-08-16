
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="org.javaiw.model.Student" id="student1" scope="session">
</jsp:useBean>
<jsp:setProperty property="CourseId" name="student1" value='<%=(Integer.parseInt(request.getParameter("t1"))) %>'/>
<jsp:setProperty property="Coursename" name="student1" value='<%=request.getParameter("t2") %>'/>
<jsp:setProperty property="Duration" name="student1" value='<%=(Integer.parseInt(request.getParameter("t3"))) %>'/>
<jsp:setProperty property="Fee" name="student1" value='<%=(Integer.parseInt(request.getParameter("t4"))) %>'/>

<a href='Data.jsp'>Click here to go next</a></body>
</html>
 