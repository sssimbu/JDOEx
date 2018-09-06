<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jdo.example.*" %>
    <%@ page import="javax.jdo.PersistenceManager" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show</title>
</head>
<body>
<%
String query="select from"+person.class.getName();

PersistenceManager pm = PMF.get().getPersistenceManager();

List<person> newobj=(List<person>)pm.newQuery(query).execute();
for(person obj:newobj)
{
	%>
	
	<h1><%=obj.getName()%></h1>
	
	
<% 	
}



%>
</body>
</html>