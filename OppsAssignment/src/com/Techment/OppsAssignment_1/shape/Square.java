package com.Techment.OppsAssignment_1.shape;

public class Square implements Polygon {
     float side;
     
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("the area of square"+side*side);

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("the perimeter of square"+4*side);

	}

}
