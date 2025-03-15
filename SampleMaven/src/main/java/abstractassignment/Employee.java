package abstractassignment;

public abstract class Employee {
	String name;
	double paymentperhour;
	
	public void employeeMethod(String name, double paymentperhour) {
		
		this.name = name;
		this.paymentperhour =paymentperhour;
		
		
	}
	
	public abstract double calculateSalary() ;
	

}
