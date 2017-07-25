<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html">
 

<html>
<head>
<title>Spring MVC -HelloWorld</title>
</head>
 

<body>
<springForm:form name="hello" commandName="command"
	method="GET" action="hello">
    <h1>${model.msg}</h1>
     <h1>${msg}</h1>
    
      <c:out value='${model.msg}'/>
      <c:out value='${msg}'/>
      <c:out value="${msg}" />
    
     The first user is <%=request.getAttribute("msg") %>
     </springForm:form>
</body>
 
 