package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set <String> var1 = new HashSet <String>();
		var1.add("Green");
		var1.add("Orange");
		var1.add("Pink");
		var1.add("Indigo");
		System.out.println(var1);//IndexOf methods can't call here
		//addAll , containsAll, contains, size, isempty, clear can call here
		Set <String> var2 = new HashSet <String>();
		var2.add("TAJ MAHAL");
		var2.add("Ball");
		var2.add("Cricket");
		var2.add("Tennis ball");
		System.out.println(var2);
		System.out.println(var2.addAll(var1));
		System.out.println(var2);
		System.out.println(var2.contains("Ball"));
		System.out.println(var2.containsAll(var1));//to know whether one set contains collection of another set
		System.out.println(var1.size());
		System.out.println(var2.isEmpty());
		var1.clear();
		System.out.println(var1);		// TODO Auto-generated method stub

	}

}
