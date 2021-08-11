package com.Techment.OppsAssignment_1;

abstract class PrepaidCard
{
	int CardNo;
	double availableBalance;
	double availableBalance1;
	double swipeLimit;
		abstract Boolean swipeCard(double amount);
		void rechargeCard(double amount)
		{
			availableBalance=availableBalance+amount;
			System.out.println("card No "+CardNo + " "+ "Available balance is"+availableBalance);
		}
		
}
interface Rewardable
{
	
	abstract double rewardPoint(double amount);

}
class TravelCard extends PrepaidCard implements Rewardable
{
	
	public double rewardPoint(double amount)
	{
		double inr =amount * 60;
		double rewardPoint=0;
		if(inr>100)
		{
			rewardPoint=rewardPoint+(inr/100);
		}
		return rewardPoint;
	}
	Boolean swipeCard(double amount)
	{
		double inr =amount * 60;
		double processingAmount;
		availableBalance1=availableBalance;
		availableBalance1 =availableBalance1-inr;
		processingAmount=inr*0.05;
		availableBalance1 =availableBalance1-processingAmount;
	   
		if(availableBalance<swipeLimit && availableBalance < availableBalance1)
		{
			
			//System.out.println("Swipe is possible");
			return true;
		}
		else
			//System.out.println("Swipe is not possible");
			return false;
		
		
	}
	
}
	
public class TestCard {

	public static void main(String[] args) {
		TravelCard travelCard=new TravelCard();
				System.out.println(travelCard.swipeCard(1000));
				travelCard.CardNo=132483649;
				travelCard.availableBalance=1000;
		        System.out.println(travelCard.rewardPoint(1000));
		        travelCard.rechargeCard(10);

	}

}
