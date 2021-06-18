package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotable;

public abstract class Planet implements Movable,Rotable,Revolvable {
	private int noOfMoons;
	
	
	public void  setNoOfMoons(int noOfMoons)
	{
		this.noOfMoons=noOfMoons;
	}
	public int getNoOfMoons()
	{
		return noOfMoons;
	}
	protected abstract boolean supportsLife();
	
	public String toString()
	{
		return "No of Moons are:"+this.noOfMoons;
	}
	
	
	

}
