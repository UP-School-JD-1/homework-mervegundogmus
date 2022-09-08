package org.mervegundogmus.oopj.week7.Employee;

public class Director extends Manager {

	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String departmentManaged) {
		super(no, name, year, workingDepartment, departmentManaged);		
	}
	
	@Override
	public void work() {
		System.out.println("Director is working!");
		manage();
	}
	
	@Override
	public void manage() {
		System.out.println("Director manages company!");
		makeAStrategicPlan();
	}

	public void makeAStrategicPlan() {
		System.out.println("Director make a strategic plan this company!");
	}
	
	public double calculateSalary() {
		return super.calculateSalary() + bonus;
	}
	
	public void printInfo() {
		System.out.println("\nDirector Info");
		super.printInfo();
	}

	@Override
	public String toString() {
		return "Director [bonus=" + bonus + ", departmentManaged=" + departmentManaged + ", no=" + no + ", name=" + name
				+ ", year=" + year + ", department=" + department + "]";
	}


	
	

}
