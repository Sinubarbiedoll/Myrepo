package interfaceassign;

import java.util.Scanner;

public class HdfcScanner implements RbiScanner {
	double MaturityAmount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposit amount : ");
		double amount = sc.nextDouble();
		System.out.println("Enter duration : ");
		int duration = sc.nextInt();
		
		RbiScanner ref = new HdfcScanner();
		ref.recurringDeposit(amount,  duration);
		sc.close();
		// TODO Auto-generated method stub

	}

	@Override
	public void recurringDeposit(double amount, int duration) {
		
		MaturityAmount = (amount * duration) + (amount * duration * (duration + 1) * Interest_Rate) / (2 * 100);
		System.out.println("The maturity amount after " +duration +" months is" + " " +MaturityAmount);
		
		
		// TODO Auto-generated method stub
		
	}

}
