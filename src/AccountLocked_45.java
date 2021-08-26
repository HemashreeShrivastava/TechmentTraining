import java.util.*;
public class AccountLocked_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int variable = 12345;
        int n=0;
        Boolean check = true;
		do
		{
			System.out.println("enetr the password");
			int pass =sc.nextInt();			
			n = n+1;
			if(pass == variable)
        	{
        		check=false;
        		break;
        	}
			else
			{
				System.out.println("enetred password is wrong will get another chance");
				
				continue;
			}

		}
        while(n<3);
		if(check==false)
		{
			System.out.println("you entered right password");
		}
		else
		{
			System.out.println("you entered wrong password and your limit got expired ");
		}

	}

}
