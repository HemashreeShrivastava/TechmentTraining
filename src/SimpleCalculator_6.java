import java.util.*;
public class SimpleCalculator_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);
		
		int n,m;
		String o;
		System.out.println("Enter First number");
		n = reader.nextInt();
		System.out.println("Enter Second number");
		m = reader.nextInt();
		System.out.print("\n Enter Symbol  for performing operation");
        o=reader.next();
		switch(o)
   		{
			case "+":
      		 		System.out.print("\n"+n +"+" +m+ "="+ (m+n));
      		 		break;
			case "-":
				System.out.print("\n"+n +"-" +m+ "="+ (m-n));
      	         		break;
			case "/":
      		 		System.out.print("\n"+n +"/" +m+ "="+ (m/n));
      		 		break;
			case "*":
      		 		System.out.print("\n"+n +"*" +m+ "="+ (m*n));
      		 		break;
			default:
      		 		System.out.print("\nInvalid option \n");
      		 		break;
    		}

	}

}
