package mypack;

import java.util.Scanner;

public class Factorial {

		// TODO Auto-generated method stub
	public static int fact(int n){  
		   /*if(n<0) 
		   {
		  System.out.println("Invalid ");
		  return 0;
		   
		   	}*/
		  
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
		 }    
		 public static void main(String args[]){  
		  int i,factorial=1;  
		  System.out.println("enter no");
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();  
		  if(n<0)
		  {
			  System.out.println("Invalid input");
		
		  }
		  else {
		 factorial = fact(n);   
		  System.out.println("Factorial of "+n+" is: "+factorial);   
		  }
		 }  

}