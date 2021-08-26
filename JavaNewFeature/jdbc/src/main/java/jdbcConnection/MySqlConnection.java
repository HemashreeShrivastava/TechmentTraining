package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlConnection {

	public static void main(String[] args) throws SQLException {
		///A o =new A();
		try {
			// step1 load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found");
		
		//step2 create the connection object
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","hema@123");
		
		
		System.out.println("connection done");
		
		Statement stmt=con.createStatement();
		//stmt.execute("insert into employee values(2,'sachine',340)");
		
		//System.out.println("inserted");
		ResultSet rs =stmt.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
