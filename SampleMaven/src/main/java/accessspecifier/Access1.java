package accessspecifier;

public class Access1 extends Modifier1 {

	public static void main(String[] args) {
		
		Access1 access = new Access1();
		access.pub();
		access.prot();
		access.defa();
	    //it can't be accessed outside the class access.priv();
		// TODO Auto-generated method stub

	}

}
