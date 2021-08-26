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
String email=request.getParameter("email");
String password=request.getParameter("psw");
try {
	// step1
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("class found");

//step2

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?autoReconnect=true&useSSL=false","root","hema@123");


System.out.println("connection done");

PreparedStatement ps =con.prepareStatement("select * from usermaster where email=? && pass=?");

ps.setString(1,email);
ps.setString(2,password);

ResultSet rs=ps.executeQuery();
rs.next();
if(rs.getString("pass").equals(password)&&rs.getString("email").equals(email))
{
out.println("Welcome " +" "+rs.getString("name"));
}
else{
out.println("Invalid password or username.");
}
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