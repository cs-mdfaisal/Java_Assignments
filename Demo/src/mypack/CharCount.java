package mypack;
import java.util.Scanner;

public class CharCount {
	
	public static int countChar(String str, char ch) {
	    int counter = 0;
	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == ch) {
	            counter++;
	        }
	    }
	 
	    return counter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		char ch;
		System.out.println("enter 1st parameter");
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		System.out.println("enter 2nd parameter");
		ch=sc.next().charAt(0);
			
		System.out.println(countChar(str,ch));

		
	}
	

}
