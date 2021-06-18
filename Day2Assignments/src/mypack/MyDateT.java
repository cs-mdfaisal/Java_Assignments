package mypack;

public class MyDateT {
	private int day;
	private int month;
	private int year;
	
	public MyDateT() {
		day=1;
		month=1;
		year=2015;
		
	}
	public MyDateT(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
		public void printDate()
		{
			System.out.println(day+"/"+month+"/"+year);
		}
	
	

}
