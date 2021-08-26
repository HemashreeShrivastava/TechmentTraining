package com.techment.register;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	private String url="jdbc:mysql://localhost:3306/user?autoReconnect=true&useSSL=false";
	private	String username="root";
	private String password="hema@123";
	private	String driver="com.mysql.cj.jdbc.Driver";

	public void loadDriver(String driver)
	{
		try {
			Class.forName(driver);
			System.out.println("driver");
;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	public Connection getConnection()
	{
		Connection con=null;
		try {
			DriverManager.getConnection(url,username,password);
			System.out.println("connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public String insert(User user)
	{
		loadDriver(driver);
		Connection con =getConnection();
		String result="insert sucessfully";
		String sql="insert into usermaster(?,?,?,?,?)";
		try {
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1,user.getUname());
		ps.setString(2,user.getEmail());
		ps.setString(3,user.getPassword());
		ps.setString(4,user.getCountry());
		ps.setInt(5,Integer.parseInt( user.getMobile()));
		ps.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			result="data is not insertred";
		}
		return result;
	}
	
	
}
