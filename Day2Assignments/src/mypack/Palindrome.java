/*
 Author: md.faisal@stltech.in
 Version: 1.0
 Date: 7/06/2021
 Copyright: Sterlite Technologies ltd
 */
package mypack;
import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String str)
    {
 
        // Initialization
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
 // Given string is a palindrome
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		if (checkPalindrome(str))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
    }
	

}
