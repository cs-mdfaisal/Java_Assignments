package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.car.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable movable;
		
		System.out.println("*****Earth object*****");
		movable=new Earth();
		Earth earth=(Earth)movable;
		earth.setNoOfMoons(1);
		earth.revolve();
		earth.move();
		earth.rotate();
		
		
		String earthString=earth.toString();
		System.out.println(earthString);
		
		if(earth.supportsLife())
		{
			System.out.println("Planet support life");
		}else
		{
			System.out.println("Planet doesn't support life");
		}
		System.out.println();
		
		System.out.println("*****Jupiter object****");
		movable=new Jupiter();
		Jupiter jupiter=(Jupiter)movable;
		jupiter.setNoOfMoons(50);
		
		jupiter.move();
		jupiter.rotate();
		jupiter.revolve();
		
		
		String jupiterString=jupiter.toString();
		System.out.println(jupiterString);
		
		if(jupiter.supportsLife())
		{
			System.out.println("Planet support life");
		}else
		{
			System.out.println("Planet doesn't support life");
		}
		System.out.println();
		
		System.out.println("****Tiger Object***");
		movable=new Tiger();
		Tiger tiger=(Tiger)movable;
		tiger.jump();
		tiger.walk();
		tiger.move();
		tiger.run();
		System.out.println();
		
		System.out.println("*****Cat Object*****");
		movable =new Cat();
		Cat cat =(Cat)movable;
		cat.jump();
		cat.walk();
		cat.move();
		cat.run();
		System.out.println();
		
		System.out.println("*****Car Object*****");
		movable =new Car();
		Car car =(Car)movable;
		car.start();
		car.stop();
		System.out.println();
		
		System.out.println("*****Human Robot object*****");
		movable =new HumanRobot();
		HumanRobot humanrobot=(HumanRobot)movable;
		humanrobot.walk();
		humanrobot.run();
		humanrobot.jump();
	}
	

}
