<html>

<body>

<h3> JSP Declaration</h3>
<%!
	String makeItLower(String data){
		return data.toLowerCase();
	}
%>

Lower case "Hello World": <%= makeItLower("Hello World") %>

</body>

</html>