package debug;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int [][]arr = new int[3][4];
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=k;
				System.out.print(arr[i][j]+" ");
				k++;
			}
			System.out.println();
		}
	}

}
