import java.util.*;
public class SeriesPrint_9 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of n upto you want to print the series");
	int n =sc.nextInt();
	System.out.println("the series as follows :");
	for(int i =1;i<=n;i++)
	{
		System.out.print("\t"+(i*i*i));
	}
}
}
