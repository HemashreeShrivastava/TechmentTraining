import java.util.*;
public class RightAngleTriangle_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("To check whether the side you entered forms right angle triangle or not");
		System.out.println("enter the first side of triangle");
		int a = sc.nextInt();
		System.out.println("enter the second side of triangle");
		int b = sc.nextInt();
		System.out.println("enter the third side of triangle");
		int c = sc.nextInt();
		if(((a*a)+(b*b))==(c*c))
		{
			System.out.println("yes triangle is right angle triangle");
		}
		else if(((a*a)+(c*c))==(b*b))
		{
			System.out.println("yes triangle is right angle triangle");
		}
		else if(((b*b)+(c*c))==(a*a))
		{
			System.out.println("yes triangle is right angle triangle");
		}
		else
		{
			System.out.println("triangle is not right angle triangle");
		}


	}

}
