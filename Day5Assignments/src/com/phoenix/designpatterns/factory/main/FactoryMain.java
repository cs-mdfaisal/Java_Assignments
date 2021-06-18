package com.phoenix.designpatterns.factory.main;
import java.util.Scanner;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.SportCar;
import com.phoenix.designpatterns.factory.cars.Car;

import com.phoenix.designpatterns.factory.cars.LuxuryCar;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a cartype ");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		
		try{
		
		Car newcar=CarFactory.newCar(str);
		newcar.start();
		newcar.run();
		newcar.stop();
		}catch(Exception e)
		{
			System.out.println("Invalid Input");
		}
		
		/*Car c1=CarFactory.newCar("sedan");
		
		c1.start();
		c1.run();
		c1.stop();
		System.out.println();
		
		Car c2=CarFactory.newCar("luxury");
		
		c2.start();
		c2.run();
		c2.stop();
		System.out.println();
		
		Car c3=CarFactory.newCar("sport");
		
		c3.start();
		c3.run();
		c3.stop();
		System.out.println();
		
		Car c4=CarFactory.newCar("couple");
		
		c4.start();
		c4.run();
		c4.stop();*/
	}

}
