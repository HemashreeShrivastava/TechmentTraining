package hello;

public class pattern2 {

	public static void main(String args[])
	{
		for(int i =0;i<4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("\t"+(j+1));
			}
			System.out.print("\n");
		}
	}
}
