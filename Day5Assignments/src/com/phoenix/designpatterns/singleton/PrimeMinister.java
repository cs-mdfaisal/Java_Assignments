package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	private static PrimeMinister ob;
	private PrimeMinister()
	{
		System.out.println("Default constructor Prime Minister");
	}
	public static PrimeMinister getInstance()
	{
		if(ob==null)
		{
			ob=new PrimeMinister();
		}
		return ob;
		
	}
	public void serveNation()
	{
		System.out.println("Prime Minister serve nation");
	}

}
