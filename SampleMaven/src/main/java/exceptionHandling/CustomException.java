package exceptionHandling;

public class CustomException {

	public static void main(String[] args) throws AgeException {
		int age = 18;
		if(age>18)
		{
			System.out.println("Voting eligible");
		}
		else
		{
			throw new AgeException("Voting uneligible");
		}
		// TODO Auto-generated method stub

	}

}
