package mypack;

public class Customer {
	private int customerId;
	private String name;
	private int age;
	private String city;
	private int pincode;
	
	public Customer() {
		
	}
	public Customer(int customerId,String name, int age, String city, int pincode) {
		this.customerId=customerId;
		this.name=name;
		this.age=age;
		this.city=city;
		this.pincode=pincode;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void printDetails() {
		System.out.println(customerId
							+"\n"+ name +
							"\n"+ age +
							"\n"+ city +
							"\n"+ pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.setName("Customer details");
		System.out.println(c.getName());
		Customer c_new=new Customer(1,"faisal",21,"Muzaffarpur",842001);
		c_new.printDetails();
		
	}

}
