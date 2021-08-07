import java.util.*;
public class glassDoor {

	public static void main(String[] args) {
		int firstDigit,lastDigit,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me the Door number where you are Standing");
		int a=sc.nextInt();
		if(a<10 || a>18)
		{
			System.out.println("Opps! move to some other Door");
		}
		else
		{
			firstDigit = a/10;
			lastDigit = a%10;
			sum = firstDigit + lastDigit;
			System.out.println("move to door number"+" "+sum);
		}
		

	}

}
