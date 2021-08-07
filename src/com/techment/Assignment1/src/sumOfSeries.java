import java.util.*;
public class sumOfSeries {
	public static int fact(int a)
	{
		int fact=1;
		if(a==0 || a==1)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<=a;i++)
			{
				fact = fact*i;
				
			}
		}
		
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr the limit upto which you want to print series");
		int n =sc.nextInt();
		int fact =fact(n);
		double sum=0;
		for(int i=1;i<n;i++)
		{
			sum += i/fact(i);
		}
		System.out.println("the sum is "+sum);
		
		
	}

}
