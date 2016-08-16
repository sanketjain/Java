<%@page import="java.util.Date" session="true"%>
<%@ taglib prefix="bank" uri="tags.javabankiw.org" %> <!-- this is third type of directive -->

<html>
<head>
<title>Insert title here</title>
</head>
<body>

 
The current date is <b><%=(new Date()) %></b>
<bank:deposit accountno="234532144" amount="1534"/>


</body>
</html>