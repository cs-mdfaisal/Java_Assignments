/*
 Author: md.faisal@stltech.in
 Version: 3.0
 Date: 11/06/2021
 Copyright: Sterlite Technologies ltd
 */

package inheritance.emp;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	
	public Employee()
	{
		empId=1;
		name="Don";
		salary=50000.00;
	}
	public Employee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}
	public Employee(int empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		
	}
	public void display()
	{
		System.out.println("EmpId:"+empId+"\nName: "+name+"\nSalary: "+salary);
	}
	public String toString() {
		return "Name: " +name+"\tsalary: "+salary+"\tEmpId: "+empId;
	}
	
}
