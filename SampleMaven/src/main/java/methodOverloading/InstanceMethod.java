package methodOverloading;

public class InstanceMethod {
	
	public int display()
	  {
	    int a = 10;
	    int b = 20;
	    int sum = a + b;
	    return sum;
	    /*System.out.println(+sum);*/
	  }
	 public int display(int a, int b)
	  {
	    int prod = a * b;
	    return prod;
	    /*System.out.println(+prod);:*/
	  }


	public static void main(String[] args) {
		
		InstanceMethod obj = new InstanceMethod();
		  /*obj.display();*/
		  /*obj.display(10,20);*/
		  System.out.println(obj.display());
		  System.out.println(obj.display(10,20));


		// TODO Auto-generated method stub

	}

}
