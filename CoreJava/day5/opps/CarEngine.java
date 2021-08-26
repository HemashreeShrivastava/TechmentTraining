package com.techment.day5.opps;
class Car
{
	int id;
	String name;
	String model;
	Engine engine;
	public Car(int id, String name, String model, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	
	void carDetail()
	{
		System.out.print("Car id :\t"+id+"\t");
		System.out.print("Car name :\t"+name+"\t");
		System.out.print("Car model :\t"+model+"\t");
		System.out.print("Engine id :\t"+engine.engineId+"\t");
		System.out.print("Car id :\t"+engine.engineType+"\t");
		System.out.print("\n");
		
		
	}
	
	
}
class Engine
{
	int engineId;
	String engineType;
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	
	
}
public class CarEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine1 =new Engine(101,"2 stock");
		Car Car1 = new Car(1001,"Maruti","800",engine1);
		Car1.carDetail();
		Engine engine2 =new Engine(109,"8 stock");
		Car Car2 = new Car(1001,"Maruti","Zen",engine2);
		Car2.carDetail();
		
		

	}

}
