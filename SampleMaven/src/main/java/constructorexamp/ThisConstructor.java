package constructorexamp;

public class ThisConstructor {
	
	/*public ThisConstructor()
	  {
	    this(10, 20);//it calls another constructor ThisConstructor(int a, int b)
	    System.out.println("Sinu");
	 
	      
	  }  
	 public ThisConstructor(int a, int b)
	  {
	    this(10, 20.5f);//it calls another constructor ThisConstructor(int a, float b)
	    int sum = a + b;
	    System.out.println(sum);
	      
	  }  
	public ThisConstructor(int a, float b)
	  {
	    float sum = a + b;
	    System.out.println(sum);
	      
	  }  */
	
	public ThisConstructor()
	{
		this(10, 50);
		System.out.println("ABHI");
		
	}
	public ThisConstructor(int a, int b)
	{
		this(10, 100.5f);
		int sum = a+b;
		System.out.println(sum);
	}
	public ThisConstructor(int a, float b)
	{
		float f = a +b;
		System.out.println(f);
	}


	public static void main(String[] args) {
		
		ThisConstructor th = new ThisConstructor();
		
		// TODO Auto-generated method stub

	}

}
