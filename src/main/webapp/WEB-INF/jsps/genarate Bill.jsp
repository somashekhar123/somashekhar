<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post">
<pre>
FirstName <input type="text" name="firstName" value="${contacts.firstName }"/>

LastName  <input type="text" name="lastName" value="${contacts.lastName }"/>

Email     <input type="text" name="email" value="${contacts.email }"/>

Mobile    <input type="text" name="mobile" value="${contacts.mobile }"/>

Product   <input type="text" name="product">

Amount    <input type="text" name="amount">

<input type="submit" value="genarate Bill">

</pre>
</form>
</body>
</html>