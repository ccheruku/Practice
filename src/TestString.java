import java.util.HashSet;

public class TestString {
	public static void main(String[] args) {
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		final String s4 = s3.intern();
		System.out.println("s1 == s2: " + (s1 == s2)); // true
		System.out.println("s2 == s3: " + (s2 == s3)); // false
		System.out.println("s3 == s4: " + (s3 == s4)); // false
		System.out.println("s1 == s3: " + (s1 == s3)); // false
		System.out.println("s1 == s4: " + (s1 == s4)); // true
		System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
		System.out.println("s2.equals(s3): " + s2.equals(s3)); // true
		System.out.println("s3.equals(s4): " + s3.equals(s4)); // true
		System.out.println("s1.equals(s4): " + s1.equals(s4)); // true
		System.out.println("s1.equals(s3): " + s1.equals(s3)); // true

		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println(hset);

	}
}