import java.util.*;
public class BestHorse_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight expected to carry by horse 1");
		int w1 = sc.nextInt();
		System.out.println("Enter the weight expected to carry by horse 2");
		int w2 = sc.nextInt();
		System.out.println("Enter the weight expected to carry by horse 3");
		int w3 = sc.nextInt();
		if((w1==w2) && (w2==w3))
		{
			System.out.println("Entered weight are not distinct value");
		}
		else
		{
			if(w1>w2)
			{
				if(w1>w3)
				{
					System.out.println("the horse 1 is most suitable for purpose of hunting having ability to carry weight"+" "+ w1);
				}
				else
				{
					System.out.println("the horse 3 is most suitable for purpose of hunting having ability to carry weight"+" "+ w3);

					
				}
			}
			else
			{
				if(w2>w3)
				{
					System.out.println("the horse 2 is most suitable for purpose of hunting having ability to carry weight"+" "+ w2);
				}
				else
				{
					
				}
		
			}
		}
		

	}

}
