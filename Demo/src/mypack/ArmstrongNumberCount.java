package mypack;

import java.util.Scanner;

public class ArmstrongNumberCount {
		
	public static void armstrongCount(int count) {
		int  n = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers are:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		System.out.println("enter no of terms");
		Scanner sc = new Scanner(System.in);
		count=sc.nextInt();
		armstrongCount(count);

	}

}
