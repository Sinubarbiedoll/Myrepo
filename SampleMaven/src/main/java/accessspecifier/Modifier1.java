package accessspecifier;

public class Modifier1 {
	
	public void pub()
	{
		System.out.println("This is a public method");
	}
	private void priv()
	{
		System.out.println("This is a private method");
	}
	protected void prot()
	{
		System.out.println("This is protected class");
	}
	void defa()
	{
		System.out.println("This is default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier1 mod = new Modifier1();
		mod.priv();
		mod.pub();
		mod.prot();
		mod.defa();

	}

}
