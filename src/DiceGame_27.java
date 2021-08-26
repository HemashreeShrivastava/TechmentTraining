import java.util.*;
public class DiceGame_27 {

	public static void main(String[] args) {
		System.out.println("The dice game");
		double a = Math.random();
		double b = Math.random();
		if(a%2==0 && b%2==0)
		{
			System.out.println("the sum of two number "+a+"+"+b+" are"+(a+b));
		}
		else
		{
			System.out.println("the subtraction of two number "+a+"-"+b+" are"+(a-b));
		}

	}

}
