<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1><b>Login Here</b></h1>
<table>
<form action="LoginServlet" method="post">
<tr>
<td><b>Enter Email Id :</b></td>
<td><input type="email" name="emailId" placeholder="Please enter  Email Id" required></td><br><br>
</tr>
<tr>
<td><b>Enter Password :</b></td>
<td><input type="password" name="passWord" placeholder="Please Enter Password"><td><br><br>
</tr>
<tr>
<td><input type="submit" value="Login"></td>
<td><input type="reset" value="reset"></td>
</tr>
<a href="Register.jsp">Register on here</a>
</form>
</table>
</center>

</body>
</html>