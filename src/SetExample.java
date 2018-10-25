import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set setA = new HashSet();

		String element = "element 1";

		setA.add(element);
		setA.add("element 2");

		System.out.println( setA.contains(element) );
		Iterator it = setA.iterator();
		 
	    while(it.hasNext()) {
	      String obj = (String)it.next();
	      System.out.println(obj);
	    }
	    String[]  wordArray =  {"Love Yourself"  , "Alive is Awesome" , "Be in present"};
	    List wordList =  Arrays.asList(wordArray);
	    
	    Iterator it1 = wordList.iterator();
		 
	    while(it1.hasNext()) {
	      String obj = (String)it1.next();
	      System.out.println(obj);
	    }
	    
	    Hashtable ht = new Hashtable();
	   // ht.put(1, null);
	    
	    HashMap hm = new HashMap();
	    hm.put(1, "1");
	    hm.put(2, "2");
	    
	    Iterator entries = hm.entrySet().iterator();
	    while (entries.hasNext()) {
	        Map.Entry entry = (Map.Entry) entries.next();
	        Integer key = (Integer)entry.getKey();
	        String value = (String)entry.getValue();
	        System.out.println("Key = " + key + ", Value = " + value);
	    }
	}
}
