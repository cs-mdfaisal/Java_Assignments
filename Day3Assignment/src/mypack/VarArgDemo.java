package mypack;

public class VarArgDemo {
	public static double average(int...b)
	{
		double result,sum=0;
		int x=b.length;
		for(int i:b)
		
			sum+=i;
			result=sum/x;
			return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6};
		System.out.println("Average : "+average(arr));
		
	}

}
