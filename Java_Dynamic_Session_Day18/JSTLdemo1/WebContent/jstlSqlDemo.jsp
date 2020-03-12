<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource
user="root"
password="root"
url="jdbc:mysql://localhost:3306/jstl"
driver="com.mysql.jdbc.Driver"
/>
<%-- <sql:update>
insert into emp_123 values(4,'Mayuresh','Indore')
</sql:update>
<sql:update>
update  emp_123 set id=2 where name='Bharat'
</sql:update> --%>
<!-- Resultset rs=st.executeQuery("select* from emp_123") -->
<sql:query var="rs" sql="select* from emp_123">
</sql:query>
<table border = "1" width = "100%">
         <tr>
            <th>Emp Id</th>
            <th>Name</th>
            <th>City</th>
            </tr>
<c:forEach var="row" items="${rs.rows}">
<tr>
<td><c:out value="${row.id}"></c:out></td>
<td><c:out value="${row.name}"></c:out></td>
<td><c:out value="${row.city}"></c:out></td>
</tr>
</c:forEach>
</table> 

</body>
</html>