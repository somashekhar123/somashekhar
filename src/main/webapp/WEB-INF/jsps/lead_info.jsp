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
<h2>Lead Data Fetch </h2>
FirstName:${m.firstName}<br/>
LastName:${m.lastName}<br/>
Email:${m.email}<br/>
Mobile:${m.mobile}<br/>    
Source:${m.source}<br/>

<form action="convet" method="post">
<input type="hidden"   name="id"    value="${m.id }"/>
<input type="submit" value="conver">

</form>

</body>
</html>