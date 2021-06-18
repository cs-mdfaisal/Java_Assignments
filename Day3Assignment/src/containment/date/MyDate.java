package containment.date;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() 
	{
		day=5;
		month=5;
		year=2050;
	}
	public MyDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	//Getter Setter methods
			public int getDay()
			{
				return day;
			}
			public void setDay(int day)
			{
				this.day=day;
			}
			public int getMonth()
			{
				return month;
			}
			public void setMonth(int month)
			{
				this.month=month;
			}
			public int getYear()
			{
				return year;
			}
			public void setYear(int year)
			{
				this.year=year;
			}
			public void printDate()
			{
				System.out.println(day+"/"+month+"/"+year);
			}
			public String toString() {
				return day +"-"+"-"+year;
			}
			
			
}
