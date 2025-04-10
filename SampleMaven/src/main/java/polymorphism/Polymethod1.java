package polymorphism;

public class Polymethod1 extends Polymethod {
	
	public void method(int a, int b)
	{
		int sub = a - b;
		System.out.println("The sub is : " +sub);
		super.method(80, 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Polymethod1 poly = new Polymethod1();
		poly.method(60, 80);
		poly.method1(50, 50);
	
		
		
	}

	@Override
	public void method1(int a, int b) {
		// TODO Auto-generated method stub
		int mul = a * b;
		System.out.println("The mul is : " +mul);
		super.method1(50, 60);
	}

}
