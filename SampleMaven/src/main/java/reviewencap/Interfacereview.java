package reviewencap;

public class Interfacereview implements Print {
	
public static void main(String[] args) {
		
	Interfacereview ref = new Interfacereview();
	Print ref1 = new Interfacereview();
		ref.display();
		ref.display1();
		// TODO Auto-generated method stub

	}

public void display1()
{
	System.out.println("This is normal class method");
}

	@Override
	public void display() {
		
		System.out.println("The Student name is Sinu");
		// TODO Auto-generated method stub
		
	}
	

	}



