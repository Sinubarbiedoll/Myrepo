package superkeyword;

public class Supervar1 extends Supervar {
	
	String color = "Black";
	
	public void colorDisplay()
	{
		System.out.println("Color is : " +color);
         System.out.println(super.color);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervar1 s = new Supervar1();
		s.colorDisplay();

	}

}
