package exercises3;

public class Employee {
	/*UML DÝAGRAM
	 * +name:String
	 * +salary:int
	 * +workHours:int
	 * +hireYear:int
	 * +Employee(String name,int salary,int workHours,int hireYear)
	 * +tax(int salary):int
	 * +bonus(int workHours):int
	 * +raiseSalary(int salary):int
	 */
	
	
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	Employee(String name,int salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
		
	}
	public double tax() {
		if(this.salary>=1000) {
			return salary * 0.03; 
		}else {
			return 0.0;
		}
	}
	public double bonus() {
		int extraHours=this.workHours-40;
		return extraHours*30;
	}
	public double raiseSalary() {
		int year=2022-this.hireYear;
		if(year<10) {
			return this.salary*0.05;
		}else if(9<year&& year<20) {
			return this.salary*0.1;
			
		}else {
			return this.salary*0.15;
		}
	}
	public void toString(Employee emp) {
		System.out.println("Name: "+emp.name);
		System.out.println("Salary: "+emp.salary);
		System.out.println("Work Hours: "+emp.workHours);
		System.out.println("Hire Date: "+emp.hireYear);
		System.out.println("Tax: "+emp.tax());
		System.out.println("Bonus: "+emp.bonus());
		System.out.println("Raise of salary: "+emp.raiseSalary());
		double totalSalary=this.salary-emp.tax()+emp.bonus();
		System.out.println("Salary with tax and bonus: "+totalSalary);
		System.out.println("Total Salary with the raise of salary: "+(emp.salary+emp.raiseSalary()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
