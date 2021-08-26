import java.util.Scanner;
public class PrimeSeries_10 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n upto you want to print the prime number series");
		int n =sc.nextInt();
		System.out.println("the series as follows :");
	
		for(int i =1;i<=n;i++)
		{
			int count =0;
			for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			
				count = count+1;
				break;
			
		}
		if(count == 0)
		{
			System.out.print("\t"+i);
		}
			
		}
		
	}

}
