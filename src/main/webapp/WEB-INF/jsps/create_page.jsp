<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Lead Data</h2>
<form action="saveLead" method="post">
<pre>
FirstName  <input type="text" name="firstName"/>

LastName   <input type="text" name="lastName"/>

Email      <input type="text" name="email"/>

Mobile     <input type="text" name="mobile"/>
source:
          <select name="source">
          <option value="volvo">Motor</option>
          <option value="bus">Bus</option>
          <option value="car">Car</option>
          </select>
          
          <input type="submit" value="save">
</pre>
</form>

</html>