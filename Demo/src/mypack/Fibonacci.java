package mypack;
import java.util.Scanner;

public class Fibonacci {

	public static void fibo(int terms)
    {
        int a = -1, b = 1, c;
        for (int i = 0; i < terms; i++)
        {
            c = a + b;
            
            a = b;
            b = c;
            System.out.println(c);
         }
      
    }
 
    public static void main (String args[])
    {
        int terms;
        System.out.println("enter no of terms");
        Scanner sc = new Scanner(System.in);
        terms=sc.nextInt();
        
        fibo(terms);
    }

}
