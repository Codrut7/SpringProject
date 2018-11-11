<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ page import="com.cinemaProject.cinemaproject.dao.implementationDAO.JPAClientDAO" %>
<%@ page import=" com.cinemaProject.cinemaproject.entities.Client" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here </title>

</head>
<body>
<h1> This is the user id <b><%JPAClientDAO service= new JPAClientDAO(); 
							 Client client = service.getClient(Long.parseLong(request.getParameter("id")));
							%>
        <%= client.getUserName() %>
</body>
</html>