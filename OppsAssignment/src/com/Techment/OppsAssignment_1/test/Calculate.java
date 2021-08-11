package com.Techment.OppsAssignment_1.test;

import com.Techment.OppsAssignment_1.shape.*;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(30.0f,5);
		rectangle.calcArea();
		rectangle.calcPeri();
		Square square = new Square(8);
		square.calcArea();
		square.calcPeri();
	}

}
