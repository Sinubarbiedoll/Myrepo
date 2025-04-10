package methodOverloading;

public class Studentmethod {
	
	public void display()
	  {

	    System.out.println("My name is sinu");
	    this.print();
    	  
	  }  
	  public void print()
	  {

	    System.out.println("My age is 25");
	    this.show(10, "Sanjana");
	  
	  }  
	  public void show(int a, String name)
	  {

	    System.out.println(a);
	    System.out.println(name);
	  
	  }  
	  
	public static void main(String[] args) {
		
		Studentmethod obj = new Studentmethod();
		  /*Studentmethod obj1 = new Studentmethod();*/

		  obj.display();  
		  /*obj1.print();*/

		// TODO Auto-generated method stub

	}

}
