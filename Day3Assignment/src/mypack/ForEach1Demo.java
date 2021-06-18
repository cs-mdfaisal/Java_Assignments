/*
 Author: md.faisal@stltech.in
 Version: 3.0
 Date: 10/06/2021
 Copyright: Sterlite Technologies ltd
 */
package mypack;

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = new double[3];
		arr[0]=50.0;
		arr[1]=60.2;
		arr[2]=70.3;
		for(double d:arr)
		{
			System.out.println(d);
		}
		System.out.println();
	
	float arr1[] = new float[3];
	arr1[0]=5.0f;
	arr1[1]=6.2f;
	arr1[2]=7.3f;
	for(float f:arr1)
	{
		System.out.println(f);
	}
	System.out.println();
	
	String arr3[]= {"Lotus","Rose","Sunflower"};
	for(String s:arr3)
	{
		System.out.println(s);
	
	}
	System.out.println();
	String arr4[]= {"India","Russia","France"};
	for(String s:arr4)
	{
		System.out.println(s);
	
	}
	
	}

}
