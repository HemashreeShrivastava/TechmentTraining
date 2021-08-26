import java.util.*;

public class ArrayListSort_47 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("enter the size of upto which you want to create collection");
		int n=scanner.nextInt();
		
		System.out.println("enter the element to array list for soeting");
		for(int i =0;i<n;i++)
		{
			list.add(scanner.next());
		}
		
		for(String counter: list){
			System.out.println(counter);
		}
		System.out.println("array collection after sorting are");
		Collections.sort(list);
		for(String counter: list){
			System.out.println(counter);
		}

	}

}
