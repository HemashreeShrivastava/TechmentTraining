package com.techment.day5.Abstract;
interface JdbcConnection
{
	void connect();
}
class Oracle implements JdbcConnection
{
     public void connect()
     {
    	 System.out.println("Connecting to Oracle database");
     }
}
class MySql implements JdbcConnection
{
	 public void connect()
     {
    	 System.out.println("Connecting to MySql database");
    	
     }
	
}
public class InterfaceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcConnection connection =new Oracle();
		
		connection.connect();
		

	}

}
