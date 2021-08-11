package com.Techment.OppsAssignment_1.shape;

public class Rectangle implements Polygon {
     float lenght;
     float breadth;
     
     
	public Rectangle(float lenght, float breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
			System.out.println("the area of rectangle"+(lenght*breadth));

	}

	@Override
	public void calcPeri() {
	
		// TODO Auto-generated method stub
		
		System.out.println("the perimeter of square"+(2*(lenght+breadth)));

	}

}
