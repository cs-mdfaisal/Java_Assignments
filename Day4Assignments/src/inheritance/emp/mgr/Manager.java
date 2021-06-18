
package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee {
		private double incentives;

		public   Manager() {
			//super(112,"Rinku",52000);
			incentives=5000.0f;
			
		}
		public Manager(int empId,String name,double salary,double incentives) {
			super(empId,name,salary);
			this.incentives=incentives;
		}
		public void showIncentives()
		{
			System.out.println("Incentives: "+incentives);
		}
		public void display()
		{
			super.display();
		}
		public String toString()
		{
			return super.toString();
		}
}
