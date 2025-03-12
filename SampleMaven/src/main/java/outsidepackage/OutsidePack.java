package outsidepackage;

import accessspecifier.Modifier1;

public class OutsidePack extends Modifier1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutsidePack out = new OutsidePack();
		out.pub();
		out.prot();
	//only public, protected can be accessible by through outside the package

	}

}
