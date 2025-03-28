package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		List <String> ref = new ArrayList <String>();
		//Add
		ref.add("Red");
		ref.add("Orange");
		ref.add("yellow");
		ref.add("violet");
		ref.add("White");
		ref.add("Black");
		System.out.println(ref);//
		//Set
	    ref.set(2, "Indigo");//to replace particular value in the index
	    System.out.println(ref);
	    ref.add("Orange");
	    System.out.println(ref);

	    //IndexOf
	    System.out.println(ref.indexOf("Orange"));//to know the index of particular object
	    //lastIndexOf
	    System.out.println(ref.lastIndexOf("Orange"));
	    System.out.println(ref.remove(3));//to remove object of particular index
	    System.out.println(ref);
	    //get method
	    System.out.println(ref.get(2));//to show particular object of index
	    //contains method
	    System.out.println(ref.contains("red"));//to know whether particular object exists in the list or not
	    System.out.println(ref.contains("Orange"));
	    //isEmpty method
	    System.out.println(ref.isEmpty());
	    if(ref.isEmpty())
	    {
	    	System.out.println("List is empty");
	    }
	    else
	    {
	    	System.out.println("List not empty");
	    }
	    //Size method
	    System.out.println(ref.size());
	    for(int i = 0;i<ref.size(); i++)
	    {
	    	System.out.println(ref.get(i));
	    }
	    for(String s : ref)
	    {
	    	System.out.println(s);
	    }
		// TODO Auto-generated method stub

	}

}
