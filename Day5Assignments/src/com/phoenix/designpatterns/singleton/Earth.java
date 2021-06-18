package com.phoenix.designpatterns.singleton;

public class Earth {
	private static Earth ob;
	private Earth()
	{
		System.out.println("Default Earth Constructor");
	}
	public static Earth getInstance()//Accessor method which returns only one object
	{
		if(ob==null)
		{
			ob=new Earth();
		}
		return ob;
	}
	public void createLife()
	{
		System.out.println("Earth create Life");
	}

}
