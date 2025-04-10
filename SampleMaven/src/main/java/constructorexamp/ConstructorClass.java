package constructorexamp;

public class ConstructorClass {
	
	
	  int x;
	  String s;

	 public ConstructorClass(int a, String name) /*Constructor*/
	  {
	    x = a; 
	    s = name;
	    
	  }
	 public void display()
	  {

	    System.out.println(x);
	    System.out.println(s);
	  
	  }  
	     
	public static void main(String[] args)
	{
	  
		ConstructorClass obj = new ConstructorClass(1, "SINU");
		ConstructorClass obj1 = new ConstructorClass(10, "VINU");
	    obj.display();
	    obj1.display();
	  
	}
	

}
