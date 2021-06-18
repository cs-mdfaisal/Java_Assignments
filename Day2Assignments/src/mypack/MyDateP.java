package mypack;

public class MyDateP {
	private int day;
	private int month;
	private int year;
	
	public MyDateP() {
		day=10;
		month=5;
		year=2022;
	}
	public MyDateP(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
		
	
	public void printDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
