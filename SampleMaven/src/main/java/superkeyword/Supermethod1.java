package superkeyword;

public class Supermethod1 extends SuperMethod {
	
	public void method1()
	{
		System.out.println("This is Method2");
        this.method2();
    }
	public void method2()
	{
		System.out.println("This is Method3");
		super.sum(10, 20);
	}
	
	

	public static void main(String[] args) {
		Supermethod1 sm = new Supermethod1();
		sm.method1();
		//sm.method();
		// TODO Auto-generated method stub

	}

}
