package containment.emp;

import containment.date.MyDate;

public class Employee {
	private int empId;
	private String name;
	//contained object
	private MyDate birthDate;
	//default constructor
	public Employee() {
		empId=111;
		name="faisal";
		birthDate=new MyDate();//creating contained object
		}
	//parametrized constructor
	public Employee(int empId,String name,MyDate birthDate) {
		this.empId=empId;
		this.name=name;
		this.birthDate=birthDate;
	}
	//Getter Setter methods
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public MyDate getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(MyDate birthDate)
	{
		this.birthDate=birthDate;
	}
	public void display()
	{
		System.out.println(empId);
		System.out.println(name);
		System.out.println(birthDate);
	}
	public String toString() {
		return empId+name+birthDate;
	}
}

