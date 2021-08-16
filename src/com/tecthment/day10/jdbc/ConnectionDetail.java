package com.tecthment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;

public class ConnectionDetail {

	public static Connection getConnected() throws Exception
	{
		Class.forName(CollectionProperty .DRIVER_NAME);
		Connection con=DriverManager.getConnection(CollectionProperty.URL,CollectionProperty.USERNAME,CollectionProperty.PASSWORD);
		System.out.println("Successfully connected");
		return con;
		
	}
}
