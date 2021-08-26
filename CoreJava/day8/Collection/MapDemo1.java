package com.techment.day8.Collection;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String,String>();
         hm.put("Sachin","Sachin is batsman");
         hm.put("dravid","he is wicket keeper");
         hm.put("dhoni","he is captain");
         hm.put("rahena","he is a batsman");//value can be same but key must be different
         hm.put("dravid","he is coach");//last upadated value can be displayed
         System.out.println("hash hm "+ hm);
         for(Entry<String, String> e:hm.entrySet())
         {
        	 System.out.println(e);
        	// System.out.println("key :"+" "+e.getKey());
        	// System.out.println("value :"+" "+e.getValue());
        	 
        	 
        	 
        	 
         }
	}

}
