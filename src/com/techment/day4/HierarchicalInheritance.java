package com.techment.day4;

class Parents
{
   public void Parent()
   {
      System.out.println("method of parent class");
   }
}
class son1 extends Parents
{
   public void son1()
   {
      System.out.println("method of first son class");
   }
}
class son2 extends Parents
{
  public void son2()
  {
     System.out.println("method of second son class");
  }
}
class daughter1 extends Parents
{
  public void daughter1()
  {
     System.out.println("method of daughter class");
  }
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		 son1 obj1 = new son1();
	     son2 obj2 = new son2();
	     daughter1 obj3 = new daughter1();
	     
	     obj1.son1();
	     obj2.son2();
	     obj3.daughter1();
		// TODO Auto-generated method stub

	}

}
