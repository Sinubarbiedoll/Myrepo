package encapassign;

public class Bank {
	private int pin;
	private int[] Validpins = {1001, 1234, 1212};
	
	public void setpin(int pin)
	{
		this.pin= pin;
	}
	public int getpin()
	{
		return pin;
	}
	
	public void validatePin(double amount)
	{
		
		for(int i = 0; i<Validpins.length; i++)
		{
			if(getpin() == Validpins[i])
			{
				System.out.println("PIN IS VALID");
				System.out.println("Withdrawal successful: " + amount);
				return;
				
			}
			/*else
			{
				System.out.println("ACCESS DENIED");
			}*/
			
		}
			
	
			System.out.println("ACCESS DENIED");
		
				
		}
	}


