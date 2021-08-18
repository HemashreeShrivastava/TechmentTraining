package com.techment.Day14.Test2;
import java.util.*;
import java.util.Map.Entry;
public class EligibleToVote {
	static List Eligibility(Map <Integer,Integer> map)
	{
		List <Integer> eligibleId =new ArrayList <Integer>();
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			if(e.getValue()>=18)
			{
				eligibleId.add(e.getKey());
			}
		}
		return eligibleId;

	}
	public static void main(String[] args) {
		HashMap<Integer,Integer> voterInfo =new HashMap <Integer,Integer> ();
		voterInfo.put(101,23);
		voterInfo.put(102,18);
		voterInfo.put(103,70);
		voterInfo.put(104,25);
		voterInfo.put(105,14);
		voterInfo.put(106,17);
		System.out.println("The list of eligible people ids are as follows");

		List<Integer> eligible=new ArrayList<Integer>();
		eligible=Eligibility(voterInfo);
		eligible.forEach(n->System.out.println(n));

	}

}
