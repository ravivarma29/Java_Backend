<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	int a = 10;
	int b = 20;
	out.println(a + b);

	String name = (String) application.getAttribute("name");
	String password= (String) session.getAttribute("pass");
	%>
	<h1>
		Hi ....
		<%=name%>
		Welcome to JSP
	</h1>
	<h1>
		Hi ....
		<%=password%>
		is already Taken
	</h1>
	<h2>Hi.... This is result Page!!!</h2>
</body>
</html>