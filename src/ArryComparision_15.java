import java.util.*;
public class ArryComparision_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of array it should be less than 16");
        int n=sc.nextInt();
        
        int [] array1;
        int []array2;
        array1 = new int [15];
        array2 = new int [15];
        if(n<16)
        {
        System.out.println("Enetr element to first array");
        for(int i =0;i<n; i++)
        {
        	array1[i]=sc.nextInt();
        	
        }
        System.out.println("Enetr element to second array");
        for(int i =0;i<n; i++)
        {
        	array2[i]=sc.nextInt();
        	
        }
        System.out.println("The element of array1");
        for(int i =0;i<n; i++)
        {
        	  System.out.println("\t"+array1[i]);
        	
        } System.out.println("The element of array2");
        for(int i =0;i<n; i++)
        {
        	  System.out.println("\t"+array2[i]);
        	
        }
        if (Arrays.equals(array1, array2))
            System.out.println("Same");
        else
            System.out.println("Not same");
        
        }
        else
        {
        	System.out.println("Please enetr size of array less than16");
        }
        
        
}

}
