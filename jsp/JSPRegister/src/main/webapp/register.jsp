<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("psw");
String country=request.getParameter("country");
String mobile=request.getParameter("mob");


try {
	// step1
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("class found");

//step2

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?autoReconnect=true&useSSL=false","root","hema@123");


System.out.println("connection done");

PreparedStatement ps =con.prepareStatement("insert into usermaster values(?,?,?,?,?)");
ps.setString(1,name);
ps.setString(3,email);
ps.setString(2,password);
ps.setString(4,country);
ps.setInt(5,Integer.parseInt(mobile));
ps.executeUpdate();
out.println("Registered Successfully");
}
catch(ClassNotFoundException e)
{
	e.printStackTrace();
}
catch(SQLException e)
{
	e.printStackTrace();
}


%>



</body>
</html>