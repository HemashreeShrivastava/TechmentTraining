import java.util.Scanner;
import java.util.*;
public class MatrixManipulation_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length of row");
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("enter the length of column");
		int m = scanner.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		System.out.println("enter the element to array1");
		for (int i = 0; i < n; i++) 
		{
	            for (int j = 0; j < m; j++) 
		    {
	                a[i][j]=scanner.nextInt();
	            }
		}
		System.out.println("enter the element to array2");
		for (int i = 0; i < n; i++) 
		{
	            for (int j = 0; j < m; j++) 
		    {
	                b[i][j]=scanner.nextInt();
	            }
		}
		   
		    
		    
			int c[][]=new int[n][m];   
		    
	
		for(int i=0;i<n;i++){    
		for(int j=0;j<m;j++){    
		c[i][j]=a[i][j]+b[i][j];     
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		//System.out.print(Arrays.toString(a)+"\t"+"+"+"\t"+Arrays.toString(b)+"\t"+"="+"\t"+Arrays.toString(c));



	}

}
