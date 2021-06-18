/*
 Author: md.faisal@stltech.in
 Version: 3.0
 Date: 10/06/2021
 Copyright: Sterlite Technologies ltd
 */
package mypack;

public class ArrayDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = new int[5];//Array Declaration and Instantaniation
		arr[0]=10;//Initialization
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int i=0;i<arr.length;i++)//Array Traversing
		{
			System.out.println(arr[i]);
		
		}
		int arr2[]= {100,200,300,400,500};
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		
		}
		String arr3[]= {"Mumbai","Delhi","Dubai"};
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		
		}
		String arr4[] = new String[3];
		arr4[0]="sleeping";
		arr4[1]="watching movie";
		arr4[2]="Travelling";
		for(int i=0;i<arr4.length;i++)
		{
			System.out.println(arr4[i]);
		
		}
	}

}
