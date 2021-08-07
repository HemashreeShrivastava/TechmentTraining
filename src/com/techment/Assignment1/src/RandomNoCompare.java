import java.util.*;
public class RandomNoCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number for comparison with system generated number");
		double a = sc.nextDouble();
		double b=Math.random();
		if(a==b)
		{
			System.out.println("the number are same");
		}
		else
		{
			System.out.println("the number are different");
		}

	}

}
