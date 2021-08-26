import java.util.*;
public class FasinatingNumber_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 int b,c;
         String con;
		System.out.println("enter the number to check wheather it is fasinating or not");
		int a = sc.nextInt();
		b=a*2;
		c=a*3;
		con=a+""+b+c;
		Boolean found = true;
		for(char i='1'; i<='9';i++)
		{
			int count=0;
			for(int j=0;j<con.length();j++)
			{
				char ch=con.charAt(j);
				if(ch==i)
				{
					count ++;
					
				}
				if(count > 1 || count == 0)  
				{  
				found = false;  
				break;  
			    }
			}
		}
		if(found)  
			System.out.println(a+ " is a fascinating number.");  
		else  
			System.out.println(a + " is not a fascinating number.");  

	}

}
