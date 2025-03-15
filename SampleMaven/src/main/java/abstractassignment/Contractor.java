package abstractassignment;

public class Contractor extends Employee {
	int workinghours;
	
	public void workingHours(int workinghours) {
		this.workinghours = workinghours;
	}

	
	/*@Override*/
	public double calculateSalary() {
		
		double salary = paymentperhour * workinghours;
		System.out.println("Salary of employee name  " +name  + " per week is " +salary);
		return salary;


		// TODO Auto-generated method stub
	}

}
