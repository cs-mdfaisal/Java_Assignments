/*
 Author: md.faisal@stltech.in
 Version: 3.0
 Date: 11/06/2021
 Copyright: Sterlite Technologies ltd
 */
package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangle.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;//reference variable
		
		s=new Circle(4.5f);
		s.calculateArea();
		s.calculatePerimeter();
		System.out.println("\t");
		
		s=new Rectangle(4,2);
		s.calculateArea();
		s.calculatePerimeter();
		System.out.println("\t");
		
		s=new Square(3);
		s.calculateArea();
		s.calculatePerimeter();
		
		
	}

}
