package com.phoenix.designpatterns.singleton;

public class Sun {
	private static Sun ob;//Reference variable
	private Sun()
	{
		System.out.println("Default Constructor Sun");
	}
	public static Sun getInstance()
	{
		if(ob==null)//check object exist or not
		{
			ob=new Sun();
		}
		return ob;
	}
	public void giveLight()
	{
		System.out.println("Sun gives Light");
	}

}
