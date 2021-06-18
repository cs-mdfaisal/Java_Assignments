/*
 Author: md.faisal@stltech.in
 Version: 3.0
 Date: 11/06/2021
 Copyright: Sterlite Technologies ltd
 */

package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape{
	private float radius;
	public Circle() {
		
	}
	public Circle(float radius) {
		this.radius=radius;
	}
	public void calculateArea()//abstract method definition
	{
		float areaOfCircle= MATH_PI*radius*radius;
		System.out.println("Area of circle : "+areaOfCircle);
		
	}
	public void calculatePerimeter() 
	{
		float perimeterOfCircle = 2*MATH_PI*radius;
		System.out.println("Perimeter of circle : "+perimeterOfCircle);
		
	}
	

}
