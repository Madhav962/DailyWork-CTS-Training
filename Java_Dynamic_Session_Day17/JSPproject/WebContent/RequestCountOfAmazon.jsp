<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- declaration tag -->
<%!
int requestCount=0;
%>
<!-- Scriplet tag -->
<%
requestCount++;

%>
<!-- Expression tag -->
<h1> No. Of users visited...........<%=requestCount %></h1>
</body>
</html>