package inheritance;

public class HierarChild1 extends HierarParent {

	public void High1()
	{
		System.out.println("This is child1 class");
	}
	public static void main(String[] args) {
		
		HierarChild1 c1 = new HierarChild1();
		c1.High();
		c1.High1();
		
		// TODO Auto-generated method stub

	}

}
