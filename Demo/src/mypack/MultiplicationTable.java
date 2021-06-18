package mypack;
import java.util.Scanner;

public class MultiplicationTable {
	
	public static void mulTable(int n) {
		for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println("enter positive no ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		mulTable(n);
	}

}
