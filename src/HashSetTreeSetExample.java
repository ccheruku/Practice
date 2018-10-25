import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSetExample {
    
    public static void main(String[] args) {
        
        HashSet<String>  obj1= new HashSet<String>();
        obj1.add("Alive");
        obj1.add("is");
        obj1.add("Awesome");
        System.out.println(obj1);
        
        TreeSet<String>  obj2= new TreeSet<String>();
        obj2.add("Alive");
        obj2.add("is");
        obj2.add("Awesome");
        System.out.println(obj2);
    }    
} 