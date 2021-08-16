package com.Techment.CollectionAssignment;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class Patient implements Comparable <Patient>
{
	private int patientId;
	private String name;
	private int age;
	public Patient(int patientId, String name, int age) {
		super();
		this.setPatientId(patientId);
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
class NameCompare implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class AgeSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		return -1;
	}
	
}

public class TestPatientList {
	
	static void getPatientAge(String name,TreeSet<Patient> patients1)
	{
	
		
		for(Patient p : patients1)
		{
			
	//		if(name.equals(p.getName()))
	//		{
				System.out.println(p.getAge());
			//}
		}
		
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Patient> patient= new ArrayList<Patient>();
		patient.add(new Patient(1,"Pihu",10));
		patient.add(new Patient(2,"Dhoni",40));
		patient.add(new Patient(3,"Rohan",20));
		System.out.println("The list of all the patient on basis of name");
		Collections.sort(patient, new NameCompare());
		for(Patient p:patient)
		{
			System.out.println(p.getName()+" "+p.getPatientId()+" "+p.getAge());
		}
		System.out.println("The list of all the patien sorting by age");
		Collections.sort(patient,new AgeSorting());
		for(Patient s :patient)
		{
			System.out.println(s.getName()+" "+s.getPatientId()+" "+s.getAge());
		}
		
		Patient p1 = new Patient(1,"Pihu",10);
		Patient p2 = new Patient(2,"Dhoni",40);
		Patient p3 = new Patient(3,"Rohan",20);
		TreeSet<Patient> patients =new TreeSet<Patient>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		System.out.println(patients.toString());
		
		for(Patient p : patients)
		{
			System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge());
		}
	
		
		

	}

}
