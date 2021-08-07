import java.util.*;
class InvalidAgeException extends Exception
{
	 public InvalidAgeException(String s)
    {
        
        super(s);
    }
}
public class InavlidAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enetr your age ");
		int age = sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException("Not valid ");
			}
			else
			{
				System.out.println("Welcome to vote");
			}
		}
		catch(InvalidAgeException ine)
		{
			System.out.println("Exception occured");
			System.out.println(ine.getMessage());
			
		}

	}

}
