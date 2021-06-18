/*
 Author: md.faisal@stltech.in
 Version: 3.0
 Date: 11/06/2021
 Copyright: Sterlite Technologies ltd
 */

package inheritance.emp;

public class WageEmp extends Employee{
	//data members
	private int noOfHours;
	private float ratePerHour;
	
	public WageEmp()//default constructor
	{
		noOfHours=8;
		ratePerHour=100.0f;
	}
	public WageEmp(int empId,String name,int hours,float rate)//parameterized constructor
	{
		super(empId,name);
		noOfHours=hours;
		ratePerHour=rate;
	}
	public void calculateWage()
	{
		System.out.println("wage: "+(noOfHours*ratePerHour));
	}
	public void display()//overriden method and invoked super class method
	{
		super.display();
	}
	public String toString()//method to return details
	{
		return super.toString();
	}

}
