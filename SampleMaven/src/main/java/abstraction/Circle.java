package abstraction;

public class Circle extends Shape{
	
	public void ChildDraw()
	{
		System.out.println("This is Child class method");
	}

	public static void main(String[] args) {
		
		Shape ref = new Circle();
		ref.draw();
		ref.draw1();
		ref.nonabstract();
		//ref.ChildDraw();using Parent reference not able to get child class properties
		// TODO Auto-generated method stub

	}

	@Override
	public void draw()
	
    {
		
		System.out.println("This is Circle");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw1() {
		
		System.out.println("Hello circle");
		// TODO Auto-generated method stub
		
	}

}
