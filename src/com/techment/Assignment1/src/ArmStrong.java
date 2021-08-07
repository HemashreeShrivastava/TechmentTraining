import java.util.*;
public class ArmStrong {
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Plaese enter the number");
		int num = sc.nextInt();
		int sum=0;
		int temp =num;
		if(num>99 && num<1000)
		{
			while(num>0) 
			{
				
				int a=num%10;
				sum=sum+(a*a*a);
				num=num/10;
			}
			if(sum==temp)
				System.out.println("the given number is an armstrong number");
			else
				System.out.println("the given number is not an armstrong number");
			
		
		
		}
		else
		{
			System.out.println("enter 3 digit number");
		}
					
	}

}
