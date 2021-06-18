package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape{
	private int side;
	
	public Square() {
		
	}
	public Square(int side)
	{
		this.side=side;
	}
	public void calculateArea() {
		float areaOfSquare=side*side;
		System.out.println("Area of square :"+areaOfSquare);
	}
	public void calculatePerimeter() {
		float perimeterOfSquare=4*side;
		System.out.println("Perimeter of square :"+perimeterOfSquare);
	}

}
