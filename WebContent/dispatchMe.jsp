<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <!-- JSP dosyasinda java kodu yazabilmek icin import islemi su sekilde yapilir... -->   
 <%@ page import ="_04_attribute.Person" %>
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

     Person person = (Person)request.getAttribute("person1");

%>
<% person.getName(); %>
<% person.getSurname(); %>
</body>
</html>