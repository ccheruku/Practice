import java.util.Arrays;

interface NumericTest {
	boolean computeTest(int n);
}

interface MyGreeting {
	String processName(String str);
}

interface MyString {
	String myStringFunction(String str);
}

interface MyGeneric<T> {
	T compute(T t);
}

public class NumericTest1 {

	public static void main(String args[]) {
		NumericTest isEven = (n) -> (n % 2) == 0;
		NumericTest isNegative = (n) -> (n < 0);

		// Output: false
		System.out.println(isEven.computeTest(5));

		// Output: true
		System.out.println(isNegative.computeTest(-5));

		MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
		MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";

		// Output: Good Morning Luis!
		System.out.println(morningGreeting.processName("Luis"));

		// Output: Good Evening Jessica!
		System.out.println(eveningGreeting.processName("Jessica"));

		// Block lambda to reverse string
		MyString reverseStr = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverseStr.myStringFunction("Lambda Demo"));

		// String version of MyGenericInteface
		MyGeneric<String> reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Integer version of MyGeneric
		MyGeneric<Integer> factorial = (Integer n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++)
				result = i * result;

			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverse.compute("Lambda Demo"));

		// Output: 120
		System.out.println(factorial.compute(5));

		int min1 = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).min().orElse(0);
		System.out.println("Min1: " + min1);

		int min2 = Arrays.stream(new int[] {}).min().orElse(0);
		System.out.println("Min2: " + min2);

	}
}
