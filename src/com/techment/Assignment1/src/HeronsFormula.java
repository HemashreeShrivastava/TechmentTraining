import java.util.*;
import java.lang.Math;

public class HeronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("To find area of triangle by Herons formula");
		System.out.println("enter first side of triangle");
		int a = scanner.nextInt();
		System.out.println("enter second side of triangle");
		int b = scanner.nextInt();
		System.out.println("enter third side of triangle");
		int c = scanner.nextInt();
		float s = (a+b+c)/2;
		double area = Math.sqrt((s*((s-a)*(s-b)*(s-c))));
		System.out.println("The area of triangle is"+area);
		

	}

}
