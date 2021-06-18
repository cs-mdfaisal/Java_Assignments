package mypack;

public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr2D = new int [1][4];
		//Initialization
		arr2D[0][0]=1;
		arr2D[0][1]=2;
		arr2D[0][2]=3;
		arr2D[0][3]=4;
		//Array Traversing
		
		for(int [] v:arr2D)
		{
			for(int ele:v)
			{
				System.out.println(ele);
			}
		}
		System.out.println();
		int [][]arr2d = {{2,3},{8,-4,3,10},{5,2,1}};
		//Array Traversing
		for(int [] v:arr2d)
		{
			for(int ele:v)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
		

}
