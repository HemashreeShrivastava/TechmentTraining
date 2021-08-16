package com.Techment.ExceptionAssignment;

public class ExceptionTest {
	
	
	static int anyFunction (int x, int y ){
		try {
			int a = x/y;
			return a;
		} 
		catch (ArithmeticException e) {
			System.out.println ( "Division by zero" );
		}
		return 0;
	}

		
		public static void main (String args[]) {
			int a,b, result;
			a=0;
			b=0;
			try{
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
				System.out.print("Value of a and b =  "+a+"  "+b);
			}
			catch(NumberFormatException e ){
				
				System.out.println("Only integers are allowed");
			}
			catch(ArrayIndexOutOfBoundsException e){ 
				System.out.println("Please enter a number on the command line");
	        }
			result  = anyFunction (a, b); 
			System.out.println ( "\nResult : " + result);
		}

}
