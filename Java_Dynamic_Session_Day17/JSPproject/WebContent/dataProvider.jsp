<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> from dataProvider</h1>
<jsp:forward page="useData.jsp">
<jsp:param value="CTS" name="company1"/>
<jsp:param value="CTS2" name="company2"/>

</jsp:forward>
</body>
</html>