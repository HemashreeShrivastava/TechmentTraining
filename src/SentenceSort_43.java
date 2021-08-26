import java.util.*;
public class SentenceSort_43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the sentence which word you want to sort");
		String str = sc.nextLine();
		String []splitStr=str.split(" ");
		String []splitStr1 = new String[str.length()];
		
		 for (int i =0;i<splitStr.length;i++)
		 {
			splitStr1[i]=splitStr[i];
		 }
		 System.out.println("the sorted word are as follows");
		 for(int i = 0; i<splitStr.length-1; i++)   
			{  
		 for (int j = i+1; j<splitStr.length; j++)   
		 {  
		 //compares each elements of the array to all the remaining elements  
		 if(splitStr[i].compareTo(splitStr[j])>0)   
		 {  
		 //swapping array elements  
		 String temp = splitStr[i];  
		 splitStr[i] = splitStr[j];  
		 splitStr[j] = temp;  
		 }  
		 }  
		}

          System.out.println(Arrays.toString(splitStr));  
		 
		 
		
		
		 
	}

	
}
