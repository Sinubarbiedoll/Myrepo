package parameterizedMethod;

public class ParameterExample {
	public static void sum(int a , int b)
	{
		int c = a+b;
		System.out.println("The sum is" +c);
	}
	public static void sub(int d , int e)
	{
		int f = d-e;
		System.out.println("The diffrence is" +f);
	}

	public static void main(String[] args) {
		
		sum(10, 90);
		sub(90, 80);
		// TODO Auto-generated method stub

	}

}
