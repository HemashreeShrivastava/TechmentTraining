<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: fuchsia;">
<h1>This is first jsp</h1>
<h2>jsp dynamic compilation</h2>
<%
int a=10;
int b=20;
out.println("the result is "+(a+b));
for(int i=0;i<10;i++)
{
	out.println("\n"+i);
}

%>
</hr>
<form action="login.jsp">
<input type ="text" name="u" placeholder="username">
<input type="password" name="p" placeholder="password">
<input type="submit" value="LOGIN">

</form>
</body>
</html>