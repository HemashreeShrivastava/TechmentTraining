import java.util.*;
public class BirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int n;
		System.out.print("\nMonth No: ");
		n = reader.nextInt();
		switch(n)
   		{
			case 1:
      		 		System.out.print("\nYour birthday is in January");
      		 		break;
			case 2:
      	  	 		System.out.print("\nYour birthday is in February");
      	         		break;
			case 3:
      		 		System.out.print("\nYour birthday is in March");
      		 		break;
			case 4:
      		 		System.out.print("\nYour birthday is in April");
      		 		break;
			case 5:
      		 		System.out.print("\nYour birthday is in May");
      	         			break;
			case 6:
      		 		System.out.print("\nYour birthday is in June");
      		 		break;
			case 7:
      		 		System.out.print("\nYour birthday is in July");
      		 		break;
			case 8:
      		 		System.out.print("\nYour birthday is in August");
      	         			break;
			case 9:
      		 		System.out.print("\nYour birthday is in September");
      	         			break;
			case 10:
      		 		System.out.print("\nYour birthday is in October");
      		 		break;
			case 11:
      		 		System.out.print("\nYour birthday is in November");
      		 		break;
			case 12:
      		 		System.out.print("\nYour birthday is in December");
      		 		break;
			default:
      		 		System.out.print("\nInvalid Month number\nPlease try again ....\n");
      		 		break;
    		}
    	}
	}


