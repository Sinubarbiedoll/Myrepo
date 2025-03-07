package superkeyword;

public class SampleConstructor {
	public SampleConstructor(int a, int b)
	{
		
		this(10, 20, 60);
		int sum = a + b;
		System.out.println(sum);
		
	}
	public SampleConstructor(int a, int b, int c)
	{
		int sum = a +b + c;
		System.out.println("The sum is : " +sum);
		
	}

}
