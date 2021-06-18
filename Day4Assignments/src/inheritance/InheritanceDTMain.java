package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee ref;
		ref=new Manager(10,"Alex",8,40);
		ref.display();
		Manager m=(Manager)ref;
		m.showIncentives();
		
		ref=new WageEmp(5,"Drag",8,50);
		ref.display();
		WageEmp w=(WageEmp)ref;
		w.calculateWage();
		
		
	}

}
