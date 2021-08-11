package com.techment.day6.Exception;
 class lateException extends Exception
 {
	 public lateException(String msg)
	 {
		 super(msg);
	 }
 }
class Student1
{
	void login (int time ) 
	{
		if(time>9)
			System.out.println("you are absent");
		else
			System.out.println("you are present");
			
	}
}


public class CustomChecked1 {

	public static void main(String[] args) throws lateException  {
		// TODO Auto-generated method stub

		Student1 student=new Student1();
		student.login(10);
	}

}
