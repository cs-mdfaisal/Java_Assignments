/*
 Author: md.faisal@stltech.in
 Version: 3.0
 Date: 10/06/2021
 Copyright: Sterlite Technologies ltd
 */
package mypack;

public class Array2Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr2D = new int [1][4];
		//Initialization
		arr2D[0][0]=1;
		arr2D[0][1]=2;
		arr2D[0][2]=3;
		arr2D[0][3]=4;
		for(int i=0;i<arr2D.length;i++)//Array Traversing
		{
			for(int j=0;j<arr2D[i].length;j++)
			{
			System.out.println("arr2D["+i+"]["+j+"] = "+arr2D[i][j]);
			}
		
		}
		int [][]arr2d = {{2,3},{8,-4,3,10},{5,2,1}};
		for(int i=0;i<arr2d.length;i++)//Array Traversing
		{
			for(int j=0;j<arr2d[i].length;j++)
			{
			System.out.print(arr2d[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
