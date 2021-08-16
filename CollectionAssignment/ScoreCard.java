package com.Techment.CollectionAssignment;
import java.util.*;
import java.util.Map.Entry;
public class ScoreCard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Runs Scored press 0 terminate");
		HashMap<String,Integer> ScoreBoard =new HashMap<String,Integer>();
		while (true) {
			System.out.println("enter the runs");
			int runs = scanner.nextInt();
			System.out.println("enter the batsman name");
			String name=scanner.next();
			
            
            if (runs == 0) {
                break;
            }
           ScoreBoard.put(name, runs);
		}
		System.out.println("Players who batted");
         for(String key :ScoreBoard.keySet())
         {
        	 System.out.println(key);
         }
         System.out.println("Scores by Players");
         for(String key :ScoreBoard.keySet())
         {
        	 String name = key.toString();
             String run = ScoreBoard.get(key).toString();
             System.out.println(name + " - " + run);
    	
         }
         System.out.print("Total Score :");
         int sum=0;
         for(Integer value :ScoreBoard.values())
         {
        	 sum=value+sum;
         }
         System.out.print("\t"+sum+"\n");
         int maxValue=0;
         System.out.print("\nName of Highest Scorer :");
         for(Integer i : ScoreBoard.values())
         {
        	
        	 if(i>maxValue)
        	 {
        		 maxValue=i;
        	 }
         }
         System.out.print(maxValue);
         System.out.println("\nenter the name of batsman whose run you want to know");
         String name = scanner.next();
         System.out.println("Runs Scored by"+name+ScoreBoard.get(name));
         
        

	}

}
