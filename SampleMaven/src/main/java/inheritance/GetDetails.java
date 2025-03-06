/*get basicpay, deduction and bonus*/
  package inheritance;

import java.util.Scanner;

public class GetDetails {
	double basicPay, deduction, bonus;
	
	public void employeeDetails()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter BasicPay: ");
	    basicPay = sc.nextDouble();
	    System.out.println("Enter deduction: ");
	    deduction = sc.nextDouble();
	    System.out.println("Enter Bonus: ");
	    bonus = sc.nextDouble();
	    sc.close();
		
		
	}		
	
}

