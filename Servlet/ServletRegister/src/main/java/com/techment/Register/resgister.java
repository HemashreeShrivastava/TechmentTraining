package com.techment.Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class resgister
 */
@WebServlet("/resgister")
public class resgister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("psw");
		String country=request.getParameter("country");
		String mobile=request.getParameter("mob");
		PrintWriter out =response.getWriter();


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


		
	}

}
