package com.techment.day14_15.multiThreading;

 class Water
 {
//synchronized	 public void drinkWater(int time) whole function get synchronized

	 public void drinkWater(int time)
	 {
		 synchronized(this)//sybnchronizing current object
		 {
		 for(int i=0;i<=time;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+"is drinking water"+i+"times");
			 
		 }}
		 for(int i=0;i<=time;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+"is eating"+i+"times");
			 
		 }
	 }
 }

class WaterBotle extends Thread
{
	Water water =new Water();

	@Override
	public void run() {
		water.drinkWater(5);
		
	}
	
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterBotle waterBotle=new WaterBotle();
	    Thread person1=new Thread(waterBotle);
	    Thread person2=new Thread(waterBotle);
	    Thread person3=new Thread(waterBotle);
	    person1.setName("amit");
	    person2.setName("siya");
	    person3.setName("kunal");
	
	    person1.start();
	    person2.start();
	    person3.start();
	}

}
