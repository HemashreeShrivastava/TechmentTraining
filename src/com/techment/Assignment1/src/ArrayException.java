import java.util.*;
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("\n enter the size of array");
		int n =sc.nextInt();
		int array1 []=new int [n];
		System.out.print("\n enter the elemernt to array");
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.print("\n here are the list of element you entered");
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+array1[i]);
		}
		System.out.print("\n enter the index value you want to search element at that index");
		int index = sc.nextInt();
		try
		{
			System.out.print("\tthe element at index"+index+"is "+array1[index]);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("The index you have entered is invalid"+aiob.getLocalizedMessage());
		}
		
	}

}
