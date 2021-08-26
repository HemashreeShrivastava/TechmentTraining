import java.util.*;
public class cmdSort_22 {
	
	public static void main(String args [])
	{
		List <String> name=new ArrayList<String>();
		for(int i=0;i<args.length;i++)
		{
			name.add(args[i]);
		}
		System.out.println("the element in list are which you entered from commond line");
        for(String list:name)
        {
        	System.out.println(list);
        }
        Collections.sort(name);
        System.out.println("the element in list are which you entered from commond line after sorting");
        for(String list:name)
        {
        	System.out.println(list);
        }
        
		
	}

}
