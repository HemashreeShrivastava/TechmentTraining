package com.tecthment.day10.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveDemo {

	public static void main(String[] args) {
		try
		{
			Connection con = ConnectionDetail.getConnected();
			PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
