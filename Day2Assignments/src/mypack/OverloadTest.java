package mypack;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEngine m = new MathEngine();
		m.multiply(4,5);
		m.multiply(1, 2,3);
		m.multiply(4.0f,5);
		m.multiply(4,5.0f);
		
	}

}
