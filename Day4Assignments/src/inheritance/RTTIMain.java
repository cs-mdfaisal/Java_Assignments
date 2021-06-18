package inheritance;
import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain {

	public static void showEmpInfo(Employee emp)
	{
		emp.display();
		if(emp instanceof Manager)
		{
			((Manager) emp).showIncentives();
		}
		
	
		if(emp instanceof WageEmp)
		{
			((WageEmp) emp).calculateWage();	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Manager Details :\n");
	Manager m=new Manager(9,"Dany",5000.0,25.0);
	showEmpInfo(m);
	
	System.out.println("\nWage Details: \n");
	WageEmp w=new WageEmp(10,"Tinku",8,50);
	showEmpInfo(w);
	}

}
