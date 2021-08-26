<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!//out side service method (declarartion tag)
int a=10;
int b=100;
int add(int a,int b)
{
	return a+b;
}


%>
<%//inside service method (scriplet tag)
String username =request.getParameter("u");
String password=request.getParameter("u");

out.println("userName"+username);
out.println("password"+password);
out.println("value of a="+a);
out.println(add(2,4));
%>
<%= a %><%--expression tag no need to give semicolon --%>
<%= add(3,6) %>
<%= a+" "+b %>
</body>
</html>