package methodOverloading;

public class MethodverloadingExamp {
	
	public static int display(int a, int b)
	{
	  int c = a+b;
	  return c;
	}
	public static int display(int d, int e, int f)
	{
	  int g = d-e-f;
	  return g;
	}
	public static float display(float g, float h)
	{
	float i = g*h;
	return i;
	}

	public static void main(String[] args) {
		
		System.out.println("The sum is: " +display(10, 70));
		System.out.println("The diff is: " +display(100, 90, 180));
		System.out.println("The prod is: " +display(10.5f, 20.5f));

		// TODO Auto-generated method stub

	}

}
