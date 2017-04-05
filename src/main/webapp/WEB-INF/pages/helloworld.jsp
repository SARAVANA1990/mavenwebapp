<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Spring MVC -HelloWorld</title>
</head>
 
 
<body>
<form:form method="POST" commandName="hello" action="hello.htm">
    <h1>${message}</h1>
</form:form>
</body>
</html>
 
  --%>
  
  
  <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Info</title>
</head>
<body>
 
  <h2>${name}</h2>
 
<%--   Email: ${email} --%>
  <br>
 
 
</body>
</html>