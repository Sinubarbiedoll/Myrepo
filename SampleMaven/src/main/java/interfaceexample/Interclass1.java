package interfaceexample;

public class Interclass1 implements Interface2 {
	

	public static void main(String[] args) {
		Interface2 ref = new Interclass1();
		ref.intermethod();
		//ref.display();can't call child class property because interface object is created here.
		// TODO Auto-generated method stub

	}

	@Override
	public void intermethod() {
		
		System.out.println("This is interface method");
		// TODO Auto-generated method stub
		
	}
	public void display()
	{
		System.out.println("Hello display");
	}

}
