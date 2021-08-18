package com.techment.Day14.Test2;
import java.util.*;

class person
{
	private int id;
	private String name;
	private int age;
	public person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	}
class validateAge extends RuntimeException
{
	String msg;

	public validateAge(String msg) {
		super();
		this.msg = msg;
	}
	
	}
class validateName extends Exception
{
	String msg;

	public validateName(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
public class TestException {

	public static void main(String[] args) throws validateName {
		Scanner scanner =new Scanner(System.in);
		try {
		System.out.println("Enter the id :");
		int id =scanner.nextInt();
		System.out.println("Enter the name :");
		String name=scanner.next();
		System.out.println("Enter the age :");
		int age=scanner.nextInt();
		if(age <15)
			throw new validateAge("please enter age greater than 15");
		else if(name.length()<3)
			throw new validateAge("please enter name of size greater than 3");
		
		person person = new person(id,name,age);
		System.out.println(person);
		}
		catch(validateAge e)
		{
			System.out.println("the exception occured"+e.toString());
		}
		

	}

}
