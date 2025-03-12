package abstraction;

public class Abstractsub extends Abstractmain {//normal class

	void display1() 
	{
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) {
		
		Abstractsub abs = new Abstractsub();
		abs.abstractmethod();
		abs.display();
		abs.display1();
		// TODO Auto-generated method stub

	}

	@Override
	void abstractmethod() {
		
		System.out.println("This is abstract class");
		
		// TODO Auto-generated method stub
		
	}

}
