package com.Techment.CollectionAssignment;
import java.util.*;
class ScoreAnalyzer
{
	private LinkedList<Integer> runsData =new LinkedList<Integer>();

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	
	void addRunsToList(int run)
	{
		runsData.add(run);
	}
	float calcRunRate()
	{
		float runRate=0f;
		int sum=0;
		for(Integer r : runsData)
		{
			sum = r+sum;
			runRate=sum/50;
		}
		return runRate;
	}
	int lowestRunsScored()
	{
		Collections.sort(runsData);
		
		return runsData.get(0);
	}
	void displayRuns()
	{
		int i=1;
		// display all runs scored by player
		System.out.print("Runs Scored :");
		for(Integer r:runsData)
		{
			System.out.print(i+"-"+r+"\t");
			i++;
		}
		System.out.print("\n");
	}
	int countPlayer()
	{
		return runsData.size();
	}
}

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//ScoreAnalyzer sa =new ScoreAnalyzer();
		System.out.println("Enter Runs And Press 0 to terminate");
		LinkedList<Integer> list=new LinkedList<Integer>();
		while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
		}
			
		ScoreAnalyzer sa = new ScoreAnalyzer(list);
			
		sa.displayRuns();
		System.out.println("Runrate :"+sa.calcRunRate());
		System.out.println("Lowest runs :"+sa.lowestRunsScored());
		System.out.println("Count of player who batted:"+sa.countPlayer());
		}
		
			
	
}
