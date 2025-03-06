package inheritance;

public class CalculateDetails extends GetDetails {

	double hra, PF;

	public void salarycalc()
	{
		
		hra = 0.05 *basicPay;
		PF = 0.2*basicPay;
		
		
	}

}
