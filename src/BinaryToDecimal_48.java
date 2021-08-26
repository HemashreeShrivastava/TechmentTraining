import java.util.*;
public class BinaryToDecimal_48 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enetr the binary number to convert in decimal");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		 int sum = 0;  
		    int n = 0;  
		    while(true){  
		      if(a == 0){  
		        break;  
		      } else {  
		          int temp = a%10;  
		          sum += temp*Math.pow(2, n);  
		          a = a/10;  
		          n++;  
		       }  
		

	}
		    System.out.println("The corresponding decimal no. is"+sum);
	}
}
