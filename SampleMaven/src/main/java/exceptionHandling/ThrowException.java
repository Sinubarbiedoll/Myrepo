package exceptionHandling;

public class ThrowException {

	public static void main(String[] args) throws Exception {
		int age = 16;
		if(age>18)
		{
			System.out.println("Voting is eligible");
		}
		else
		{
			throw new Exception("Voting not eligible");
		}
		// TODO Auto-generated method stub

	}

}
