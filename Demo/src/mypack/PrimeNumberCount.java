package mypack;

import java.util.Scanner;

public class PrimeNumberCount {
	public static void primeCount(int count) {
		int i=2,j,n=1,flag;
		while(n<=count)
		{
			flag=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			n++;
			}
		
		i++;
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		System.out.println("enter no ");
		Scanner sc = new Scanner(System.in);
		count=sc.nextInt();
		primeCount(count);

	}

}
