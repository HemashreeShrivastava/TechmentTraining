import java.util.*;

//import com.sun.tools.javac.code.Attribute.Array;
public class Anagram_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("To check String are anagram or not");
		System.out.println("Enter first string");
		String str1 = sc.next();
		System.out.println("Enter Second string");
		String str2 = sc.next();
		char[] ch1 = str1.toLowerCase().toCharArray();  
        char[] ch2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ch2);
        Arrays.sort(ch1);
        if(ch1.length!=ch2.length)
        {
        	System.out.println("the string are not anagram");
        }
        else
        {
        if(Arrays.equals(ch1, ch2))
        {
        	System.out.println("the string are anagram");
        	
        }
        else
        {
        	System.out.println("the string are not anagram");
        }
        }
        
	}

}
