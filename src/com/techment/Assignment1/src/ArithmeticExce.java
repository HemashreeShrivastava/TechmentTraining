import java.util.*;
public class ArithmeticExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first integer");
		int a = sc.nextInt();
		System.out.println("enter second integer");
		int b = sc.nextInt();
		try 
		{
			float div =  a/b;
			System.out.println(a+"/"+b+"="+a/b);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("error handled "+e.getMessage()+"divide by zero error");
		}
		finally
		{
			System.out.println("if exception occured than handled successfully");
		}

	}

}
