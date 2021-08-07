import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the to check whether price is divisible by 3 and 8 ");
		int a =sc.nextInt();
		if((a%3==0) && (a%8==0))
		{
			System.out.println("the number is divisible by 3 and 8");
		}
		else
		{
			System.out.println("the number is not  divisible by 3 and 8");
		}

	}

}
