package com.techment.day7.DynamicArray;
import java.util.*;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> o1 = new ArrayList<Integer>();
        o1.add(1);
        o1.add(2);
        o1.add(3);
        o1.add(4);
        o1.add(5);

        System.out.println("element in o2"+o1);
        ArrayList<Integer> o2 = new ArrayList<Integer>();
        
        o2.add(100);
        o2.add(102);
        o2.add(103);
        o2.add(3);
        o2.add(3);
        /*     o2.addAll(o1);// adding one collection in other
      System.out.println("element in o2"+o2);
        o2.retainAll(o1);
        System.out.println("element in o2 after retaining"+o2);
        o2.removeAll(o1);
        System.out.println("element in o2 after removing "+o2);      
	*/
        Collections.sort(o2);
        System.out.println("element in o2 after sorting "+o2);      
	}

}
