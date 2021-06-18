package com.phoenix.shapes.rectangle;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle() {
		
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void calculateArea() {
		float areaOfRectangle=length*breadth;
		System.out.println("Area of Rectangle :"+areaOfRectangle);
	}
	public void calculatePerimeter() {
		float perimeterOfRectangle=2*(length+breadth);
		System.out.println("Perimeter of rectangle :"+perimeterOfRectangle);
	}
	
}
