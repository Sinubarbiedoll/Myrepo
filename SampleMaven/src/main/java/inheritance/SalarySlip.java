package inheritance;

public class SalarySlip extends TotalSalary {
	 void printSlip() {
	        System.out.println("\n===== Salary Slip =====");
	        System.out.println("Basic Pay   : "+ basicPay);
	        System.out.println("HRA (5%)    : " + hra);
	        System.out.println("PF (20%)    : " +PF);
	        System.out.println("Deduction   : " +deduction);
	        System.out.println("Bonus       : " +bonus);
	        System.out.println("----------------------");
	        System.out.println("Total Salary: " +totalSalary);
	    }

}
