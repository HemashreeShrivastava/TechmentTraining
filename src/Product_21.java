import java.util.*;

class productList
{
	private int id;
	private String name;
    private	float price;
    
	public productList(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    
}
public class Product_21 {
	
public static void main(String args[])
{
	//productList prd = new productList();
	ArrayList <productList> list=new ArrayList<productList>();
	System.out.println("enter the total number of product");
	Scanner scanner =new Scanner(System.in);
	int n=scanner.nextInt();
	for(int i =0;i<n;i++)
	{
		System.out.println("enter the product id");
		int id=scanner.nextInt();
		System.out.println("enter the product name");
		String name= scanner.next();
		System.out.println("enter the product price");
		float price=scanner.nextFloat();
	   	
        list.add(new productList(id,name,price));
	}
	System.out.println("the product list are as follows");
	for(productList p : list)
	 {
		 System.out.println(p.getId()+" " + p.getName()+" " +p.getPrice());
	 }
}
}
