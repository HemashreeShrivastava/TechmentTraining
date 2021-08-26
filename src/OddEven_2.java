import java.util.*;
public class OddEven_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter today's date");
		int a=sc.nextInt();
		if(a<0 || a>31)
		{
			System.out.println("please enter valid date");
		}
		else
		{
			if(a%2==0)
			{
			   System.out.println("Cars with Even registration numbers are permitted today");
			}
			else
			{
				System.out.println("Cars with Odd registration number are permitted today");
			}
			
		}
		


	}

}
