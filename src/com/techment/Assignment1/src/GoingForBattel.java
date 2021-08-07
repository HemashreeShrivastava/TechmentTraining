import java.util.*;
public class GoingForBattel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = sc.nextInt();
		System.out.println("Enter second number");
		int second = sc.nextInt();
		System.out.println("the list of soldiers are as follow");
		for(int n=first ; n<=second;n++)
		{
			System.out.print("\t"+ n +"\t");
			
		}

	}

}
