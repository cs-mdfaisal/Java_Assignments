/*
 Author: md.faisal@stltech.in
 Version: 1.0
 Date: 9/06/2021
 Copyright: Sterlite Technologies ltd
 */
package mypack;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("InterestRate is : "+Account.getInterestRate());
		//set Data  using setter
		Account a1 = new Account();
		a1.setAccNo(123);
		a1.setBalance(1000);
		a1.setDurationYears(2);
		a1.setOwnerName("MD");
		a1.printDetails();
		a1.calculateInterest();
		//Parameterized constructor
		Account a2 = new Account(100,"Ron",2000,2);
		a2.printDetails();
		a2.calculateInterest();
		System.out.println("No of accounts : "+Account.getCount());
	
	}

}
