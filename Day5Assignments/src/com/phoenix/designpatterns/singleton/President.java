package com.phoenix.designpatterns.singleton;

public class President {
	private static President ob;
	private President()
	{
		System.out.println("Default constructor President");
	}
	public static President getInstance()
	{
		if(ob==null)
		{
			ob=new President();
		}
		return ob;
		
	}
	public void representNation()
	{
		System.out.println("President represent nation");
	}


}
