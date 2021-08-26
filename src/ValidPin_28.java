import java.util.*;
public class ValidPin_28 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int variable = 12345;
        int n=0;
        Boolean check = true;
		do
		{
			System.out.println("enetr the password correct otherwise you will caught in loop until you entered correct pin");
			int pass =sc.nextInt();			
			n = n+1;
			if(pass == variable)
        	{
        		check=false;
        		break;
        	}
			else
			{
				continue;
			}

		}
        while(true);
		if(check==false)
		{
			System.out.println("you entered right password");
		}
		


	}

}
