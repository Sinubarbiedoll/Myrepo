package interfaceexample;

public class ChildPrint implements Print, Print1, Printresult2 {

	public static void main(String[] args) {
		
		ChildPrint ref = new ChildPrint();
		ref.printresult();
		ref.printresult1();
		ref.display2();
		// TODO Auto-generated method stub

	}

	@Override
	public void printresult1() {
		
		System.out.println("Thus is printresult1 method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printresult() {
		
		System.out.println("This is printresult method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display2() {
		
		System.out.println("This is display2 method");
		// TODO Auto-generated method stub
		
	}

}
