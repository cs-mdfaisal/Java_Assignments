/*
 Author: md.faisal@stltech.in
 Version: 1.0
 Date: 7/06/2021
 Copyright: Sterlite Technologies ltd
 */
package mypack;
import java.util.Scanner;

public class VowelCount {
	public static int countVowels(String str) {
		int vowel=0;
		
		for (int i = 0; i < str.length(); i++) { 
				char ch = str.charAt(i);
                    if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='o') 
                       vowel++; 
		}
  
	
		return vowel;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		str= sc.nextLine();
		char[] c = str.toCharArray();
		System.out.println("Vowels: " + countVowels(str));
		
	}

}
