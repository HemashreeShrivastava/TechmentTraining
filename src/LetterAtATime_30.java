import java.util.*;
public class LetterAtATime_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the message");
		String msg =scanner.nextLine();
		int chrCount =0;
		String []splitStr=msg.split(" ");
		for(int i=0;i<msg.length();i++)
		{
			if(msg.charAt(i)>'a' ||msg.charAt(i)<'z'||msg.charAt(i)>'A'||msg.charAt(i)<'Z')
				chrCount=chrCount+1;
			//if (count[(int)msg.charAt(i)] == 1)
             //   System.out.print(msg.charAt(i));
				
		}
		int last =msg.length()-1;
		System.out.println("the character in whole sentence consists of :"+(chrCount-(splitStr.length)+1));
		System.out.println("the first character is  :"+msg.charAt(0));
		System.out.println("the last character is :"+msg.charAt(last));
		System.out.println("the all character used in message are :");
		
		
		
		

	}

}
