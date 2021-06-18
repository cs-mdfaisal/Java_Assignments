package mypack;

import containment.date.MyDate;

public class DateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate  arrDate[]=new MyDate[2];
		arrDate[0]=new MyDate();
		arrDate[1]=new MyDate(9,6,2021);
		for(int i=0;i<arrDate.length;i++) {
			System.out.println(arrDate[i]);
		}
	}

}
