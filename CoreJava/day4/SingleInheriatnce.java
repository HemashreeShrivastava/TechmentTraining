package com.techment.day4;

class EmpSalary
{
	int id;
	String name;
	double salary;
	EmpSalary(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
class EmpBonus extends EmpSalary
{
	
	

		EmpBonus(int id, String name, double salary) {
		super(id, name, salary);
		double bonus = super.salary+8000;
		System.out.print("bonus"+bonus);
		// TODO Auto-generated constructor stub
	}

		
		
	
	
	
}
public class SingleInheriatnce {

	public static void main(String[] args) {
		EmpBonus emp1 =new EmpBonus(11,"Ravi",100.0);
		System.out.println(emp1.toString());
		EmpBonus emp2 =new EmpBonus(12,"Rishi",10000.0);
		System.out.println(emp2.toString());
		// TODO Auto-generated method stub

	}

}
