import java.util.Scanner;

public class TotalStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the total product you have in store");
		int n = sc.nextInt();
		System.out.println("enetr the quantiy o each product on by 1");
		int [] quantity;
		quantity=new int[100];
		for(int i =0;i<n;i++)
		{
			quantity[i]=sc.nextInt();
		}
		System.out.println(" the quantity of each product you entered");
		for(int i =0;i<n;i++)
			{
				System.out.print("\t"+ quantity[i]);
			}
		
		int add = 0;
		for(int i=0;i<n;i++)
		{
			
			add = add + quantity[i];
				
			
		}
		System.out.println("\n the total stock available is :"+ add);
		
		
			
	}



	

}
