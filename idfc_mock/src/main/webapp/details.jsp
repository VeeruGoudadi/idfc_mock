<%@page import="com.dto.Mock_dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Rating</td>
		</tr>

		<%
			Mock_dto dto = (Mock_dto) request.getAttribute("key2");
		%>
		<tr>
			<td><%=dto.getId()%></td>
			<td><%=dto.getName()%></td>
			<td><%=dto.getRating()%></td>
		</tr>
	</table>
</body>
</html>