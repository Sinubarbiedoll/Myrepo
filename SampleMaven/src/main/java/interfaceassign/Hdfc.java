package interfaceassign;


public class Hdfc implements Rbi {
	double amount;
	int duration;
  double maturityAmount;

	public static void main(String[] args) {
		
		Rbi ref = new Hdfc();
		ref.recurringDeposit(3000, 24);
		// TODO Auto-generated method stub

	}

	public void recurringDeposit(double amount, int duration) {
		
        maturityAmount = (amount * duration) + (amount * duration * (duration + 1) * Interest_Rate) / (2 * 100);
        System.out.println("Deposit amount is : " +amount);
        System.out.println("Duration of depositing amount is : " +duration);
        System.out.println("The maturity amount customer get according to given details is : " +maturityAmount);


		// TODO Auto-generated method stub
		
	}
	
}
