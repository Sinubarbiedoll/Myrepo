package superkeyword;

public class Superadd extends Superclass {
	public void checkdivisibility()
	{
		
		int sum = super.add(25, 30);
		System.out.println("The sum is : " +sum );
		if(sum%10==0)
		{
			System.out.println("The number is divisible by 10");
		}
		else 
		{
			System.out.println("The number is not divisible by 10"); 
		}
		
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Superadd div = new Superadd();
		div.checkdivisibility();

	}
}


