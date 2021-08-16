package com.techment.day8.Collection;
import java.util.*;

class Student
{
	int id;
	String name;
	int  age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
class AgeSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		return -1;
	}
	
}
class NameString implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>Studlist=new ArrayList<Student>();
		Studlist.add(new Student(1,"megha",23));
		Studlist.add(new Student(2,"rohit",19));
		Studlist.add(new Student(3,"ankit",20));
		
		for(Student student : Studlist)
		{
			System.out.println(student.name+" "+student.id+" "+student.age );
		}
		System.out.println("after sorting by age");
		Collections.sort(Studlist,new AgeSorting());
		for(Student student : Studlist)
		{
			System.out.println(student.name+" "+student.id+" "+student.age );
		}
		System.out.println("after sorting by age");
		Collections.sort(Studlist,new NameString());
		for(Student s :Studlist)
		{
			System.out.println(s.toString());
		}

	}

}
