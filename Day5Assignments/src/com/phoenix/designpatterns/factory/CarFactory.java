package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.SportCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;

public class CarFactory {
	public static Car newCar(String carType)
	{
		if(carType.equals("sedan"))
			return new SedanCar();
		else  if(carType.equals("couple"))
			return new CoupleCar();
		else if(carType.equals("sport"))
			return new SportCar();
		else if(carType.equals("luxury"))
			return new LuxuryCar();
		else return null;

	}

}
