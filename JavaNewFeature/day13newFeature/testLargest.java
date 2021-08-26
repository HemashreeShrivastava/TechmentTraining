package com.techment.day13newFeature;

interface LargeNumber
{
	int largest(int a, int b, int c);
}


class CalculationUtil
{
	int findLargest(int a, int b, int c)
	{  if(a>b && a>c)
		   return a;
	   else if(b>a && b>c)
		   return b;
	   return c;
		
	}
	}
public class testLargest {

	public static void main(String[] args) {
		
       LargeNumber largeNUm =(a,b,c)->{
    	   if(a>b && a>c)
    		   return a;
    	   else if(b>a && b>c)
    		   return b;
    	   return c;
    				   
    	   
       };
       
       System.out.println("largest by lambda expression"+ largeNUm.largest(10,2, 8));
       
       CalculationUtil calc = new CalculationUtil();
       LargeNumber large = calc::findLargest;
       
       System.out.println("largest by method reference"+ large.largest(78, 8, 10));
       
	}

}
