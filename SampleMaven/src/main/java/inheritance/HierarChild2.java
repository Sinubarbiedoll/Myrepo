package inheritance;

public class HierarChild2 extends HierarParent{
	public void High2()
	{
		System.out.println("This is child2 class");
	}

	public static void main(String[] args) {
		
		HierarChild2 c2 = new HierarChild2();
		c2.High();
		c2.High2();
		// TODO Auto-generated method stub

	}

}
