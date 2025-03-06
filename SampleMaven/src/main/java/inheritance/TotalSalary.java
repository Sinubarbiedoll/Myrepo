package inheritance;

public class TotalSalary extends CalculateDetails {
	double totalSalary;

   public void calculateTotal() {
        totalSalary = basicPay + hra - PF - deduction + bonus;
    }

}
