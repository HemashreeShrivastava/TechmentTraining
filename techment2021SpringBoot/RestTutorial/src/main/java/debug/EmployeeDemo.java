package debug;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	String display()
	{
		String message="hi";
		name=name.concat(message);
		return "id" +id+"name"+name;
	}
}


public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp =new Employee(1,"hemashree");
		String name= emp.display();
		Employee emp2 = null;
		String res1 =emp2.display();
		System.out.println(name);
	}

}
