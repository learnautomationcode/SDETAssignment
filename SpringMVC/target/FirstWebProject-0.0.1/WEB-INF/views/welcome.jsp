<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
 <h1>
 <!-- html comment -->
 <%-- JSP comment --%>
  Welcome Home <%= request.getParameter("name") %>!
   </h1>
  <h1>
   Your age is ${param.age}
  </h1>
  <% int i=0; %>
  <%= ++i %>
 
<%--  <%@ include file="footer.jsp" %> --%>
</body>
</html>