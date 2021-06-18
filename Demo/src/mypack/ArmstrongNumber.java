package mypack;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void armstrong(int num) {
		int temp1=num,sum=0;
		while(temp1>0) {
			int temp2=temp1%10;
			temp1/=10;
			sum+=temp2*temp2*temp2;
		}
		if(num==sum)
		
			System.out.println("Number is armstrong ");
		else {
			System.out.println("Not armstrong");
		}
	}
	public static void main(String[] args) {
		System.out.println("enter no ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		armstrong(num);
	}
}
