package inheritance;

public class SingleChild extends SingleParent {
	
	public void child()
	{
		System.out.println("This is a child class");
	}
	


	public static void main(String[] args) {
 
		/*SingleParent P = new SingleParent();
		P.display();*/
		SingleChild C = new SingleChild();
		C.child();
		C.display();
		
	}

}
