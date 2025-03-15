package interfaceexample;

public class Interclass implements Interfaceexamp {
	

	public static void main(String[] args) {
		
		Interclass inter = new Interclass();
		inter.display();
		inter.display1();
		System.out.println(inter.name);
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display()
	{
		
		System.out.println("This is an abstract method");
		// TODO Auto-generated method stub
		
	}
	public void display1()
	{
		System.out.println("Hello Interface");
	}

}
