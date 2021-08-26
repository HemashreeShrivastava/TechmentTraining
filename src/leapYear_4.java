import java.util.*;
public class leapYear_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year which you want to check");
		int year = sc.nextInt();
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					System.out.println("The yaer is leap year");
				}
				else
				{
					System.out.println("The yaer is not leap year");
				}
			}
			else 
			{
				System.out.println("The yaer is leap year");
			}
		}
		else
		{
			System.out.println("The yaer is not leap year");
		}

	}

}
