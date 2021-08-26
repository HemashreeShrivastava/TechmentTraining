package com.techment.Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginProcess
 */
@WebServlet("/loginProcess")
public class loginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginProcess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("psw");
		PrintWriter out = response.getWriter();
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




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
