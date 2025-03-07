package superkeyword;

public class ChildConstructor extends SampleConstructor {
	public ChildConstructor()
	{
		super(50, 60);
		System.out.println("This is Child Class Constructor");
	}

	public static void main(String[] args) {
		
		ChildConstructor c = new ChildConstructor();
	}

}
