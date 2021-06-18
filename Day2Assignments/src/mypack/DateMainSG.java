package mypack;

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateSG a1 = new MyDateSG();
		MyDateSG a2 = new MyDateSG(12,12,2025);
		MyDateSG a3 = new MyDateSG();
		a3.setDay(12);
		a3.setMonth(6);
		a3.setYear(2022);
		a1.printDate();
		a2.printDate();
		a3.printDate();
	}

}
