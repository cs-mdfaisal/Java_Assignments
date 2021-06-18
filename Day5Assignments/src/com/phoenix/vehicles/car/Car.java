package com.phoenix.vehicles.car;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car run");
	
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car move");
	
	}
	public void start()
	{
		System.out.println("Car start");
	}
	public void stop()
	{
		System.out.println("Car stop");
	}

}
