package com.tecthment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) throws SQLException {
		///A o =new A();
		try {
			// step1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found");
		
		//step2
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","hema@123");
		
		
		System.out.println("connection done");
		
		Statement stmt=(Statement) con.createStatement();
		stmt.execute("insert into employee values(2,'sachine',340)");
		System.out.println("inserted");
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
