package com.techment.day7.DynamicArray;
import java.util.*;
public class TaskArrayDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<String> batch1 = new ArrayList<String>();
		ArrayList<String> batch2 = new ArrayList<String>();
		ArrayList<String>newList = new ArrayList<String>();
		batch1.add("sachin");
		batch1.add("ravi");
		batch1.add("kumar");
		batch1.add("sowmya");
		batch2.add("sourab");
		batch2.add("manish");
		batch2.add("sachin");
		batch2.add("ankit");
		batch2.add("kumar");
		System.out.println("The students in batch 1"+batch1);
		System.out.println("The students in batch 2"+batch2);
		batch2.addAll(batch1);
		System.out.println("The students in list after merging batch 1 and batch 2"+batch2);
	    //newList.addAll(batch2);
		batch1.clear();
		batch1.addAll(batch2);
		batch1.retainAll(batch2);
		  for (String element : batch1) {
			  
	            // If this element is not present in newList
	            // then add it
	            if (!newList.contains(element)) {
	  
	                newList.add(element);
	            }
	        }		 
		System.out.println("The students in list after removing duplicate value from list"+newList);
		Collections.sort(newList);

		System.out.println("The students in list after"+newList);
		
		
	}		
	}

