/*
 Author: md.faisal@stltech.in
 Version: 1.0
 Date: 9/06/2021
 Copyright: Sterlite Technologies ltd
 */
package mypack;

public class Account {
	//Non Static members
		private int accNo;
		private String ownerName;
		private double balance;
		private float durationYears;
		//Static data members
		private static float interestRate;
		private static int count;
		//Static init block
		static {
			interestRate = 0.05f;
		}
		//Default Constructor 
		Account(){
			accNo = 1;
			durationYears = 1;
			ownerName = "faisal";
			balance = 1000;
			count++;
			
			}
		//Parametrized Constructor
		Account(int accNo,String ownerName,double balance,float years){
			this.accNo=accNo;
			this.ownerName=ownerName;
			this.balance=balance;
			this.durationYears=years;
			count++;
		}
		//Getter Setter methods
		public int getAccNo()
		{
			return accNo;
		}
		public void setAccNo(int accNo)
		{
			this.accNo=accNo;
		}
		public float getDurationYears()
		{
			return durationYears;
		}
		public void setDurationYears(float durationYears)
		{
			this.durationYears=durationYears;
		}
		public String getOwnerName()
		{
			return ownerName;
		}
		public void setOwnerName(String ownerNmae)
		{
			this.ownerName=ownerName;
		}
		public double getBalance()
		{
			return balance;
		}
		public void setBalance(double balance)
		{
			this.balance=balance;
		}
		public static float getInterestRate()
		{
			return interestRate;
			
		}
		public static void setInterestRate(float interestRate)
		{
			interestRate=interestRate;
		}
		public static int getCount()
		{
			return count;
		}
		//Interest calculating
		public void calculateInterest()
		{
			System.out.println("Interest is: "+balance*interestRate*durationYears);
		}
		public void printDetails()
		{
			System.out.println("Account No : "+accNo);
			System.out.println("Owner Nmae : "+ownerName);
			System.out.println("Balance : "+balance);
			System.out.println("Duration Years :"+durationYears);
			
		}
}


