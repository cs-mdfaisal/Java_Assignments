package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"ron",520);
		e1.display();
		e1.toString();
		
		Manager m1=new Manager();
		m1.showIncentives();
		m1.display();
		m1.toString();
		
		WageEmp w1=new WageEmp();
		w1.calculateWage();
		w1.display();
		w1.toString();
		
		WageEmp w2=new WageEmp(12,"dot",8,50);
		w2.display();
		w2.toString();		
	}

}
