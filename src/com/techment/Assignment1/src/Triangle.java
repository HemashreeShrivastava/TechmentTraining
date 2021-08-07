import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("To check whether the side you entered formed a triangle or not");
		System.out.println("enter the first side of triangle");
		int a = sc.nextInt();
		System.out.println("enter the second side of triangle");
		int b = sc.nextInt();
		System.out.println("enter the third side of triangle");
		int c = sc.nextInt();
		if((a+b)>c)
		{
			System.out.println("the side you eneter follow the rule of triangle and hence triangle formed "+a+" "+"+"+" "+" "+b +">"+c );
		}
		else if((a+c)>b)
		{
			System.out.println("the side you eneter follow the rule of triangle and hence triangle formed "+a+" "+"+"+" "+" "+c +">"+b );
		}
		else if((b+c)>a)
		{
			System.out.println("the side you eneter follow the rule of triangle and hence triangle formed "+b+" "+"+"+" "+" "+c +">"+a );
		}
		else
		{
			System.out.println("trianglr cannot be formed");
		}

	}

}
