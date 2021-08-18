package com.techment.Day14.Test2;
import java.util.*;
import java.util.stream.Collectors;


class  WWE
{
	private String firstName ;
	private String lastName ;
	private int weight;
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
}

public class WWEWrestlerImplementation {
	static void printFirstName(List <WWE> list)
	{
		List<String> firstName =list.stream().map(e->e.getFirstName()).collect(Collectors.toList());
		System.out.println("the list of wrestlers are"+ firstName);
		firstName.forEach(n->System.out.println(n));
	
	}
	static void weightOfWrestler(List <WWE> list,String name)
	{
		System.out.println(" the weight of "+name+"is :"+list.stream().filter(e->e.getFirstName().equals(name)).map(e->e.getWeight()));
	}
	

	public static void main(String[] args) {
		ArrayList<WWE> wrestler= new ArrayList<WWE>();
		wrestler.add(new WWE("Rahul","Sharma",50));
		wrestler.add(new WWE("Sachin","Sahu",190));
		wrestler.add(new WWE("Dravid","Mishra",220));
		wrestler.add(new WWE("Javed","jaffari",235));
		wrestler.add(new WWE("Shekhar","Tondon",80));
		wrestler.add(new WWE("Ramesh","Bhalla",100));
		
		System.out.println("Total number of Wrestler are :"+wrestler.stream().collect(Collectors.counting()));
		
		System.out.println("The sum of weight of wrestler whose weight is greater than 200 : "+wrestler.stream().filter(e->e.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum());
		
		printFirstName(wrestler);
		weightOfWrestler(wrestler,"Rahul");
	}

}
