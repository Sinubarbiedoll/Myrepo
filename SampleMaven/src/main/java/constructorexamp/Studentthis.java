package constructorexamp;

public class Studentthis {
	/*To access same name of local and Instance variable*/
	
	  int a;
	  String name;

	 public Studentthis(int a, String name) /*Constructor*/
	  {
	    this.a = a;
	    this.name = name; 
	   
	  }
	 public void display()
	  {

	    System.out.println(a);
	    System.out.println(name);
	  
	  }  
	     
	public static void main(String[] args)
	{
	  
	  Studentthis obj = new Studentthis(1, "SINU");
	  Studentthis obj1 = new Studentthis(10, "VINU");
	  obj.display();
	  obj1.display();
	  
	}
	}



