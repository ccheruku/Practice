import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Chaitanya");
		names.add("Steve");
		names.add("Jack");

		Iterator it = names.iterator();

		while (it.hasNext()) {
			String obj = (String) it.next();
			System.out.println(obj);
		}
		
		for(String obj : names) {
	        System.out.println(obj); 
	        //We are adding element while iterating list
	        //names.add("C++");
	     }
	}

}