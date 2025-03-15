package abstractassignment;

public class FullTimeEmployee extends Employee {
	int workinghours;
	public void workingHours(int workinghours) {
		this.workinghours = workinghours;
	}

	public static void main(String[] args) {
		
		Contractor Contract = new Contractor ();
		Contract.employeeMethod("Alice", 200);
		Contract.workingHours(30);
		Contract.calculateSalary();
		
		Employee fulltime = new FullTimeEmployee();
		fulltime.employeeMethod("SINU", 2000);
		fulltime.calculateSalary();

		
		// TODO Auto-generated method stub

	}

	@Override
	public double calculateSalary() {
		
		double salary = paymentperhour * 8;
		System.out.println("Salary of employee name  " +name  + " full time is " +salary);
		return salary;


		// TODO Auto-generated method stub
	}

}
