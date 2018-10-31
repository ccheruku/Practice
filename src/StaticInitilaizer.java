public class StaticInitilaizer {
	public static final int A = 5;
	public static final int B;

	// Static initializer block, which is executed only once when the class is
	// loaded.
	static {
		if (A == 5) {
			B = 10;
			System.out.println("A= " + A + "B= " + B);
		}

		else {
			B = 5;
			System.out.println("A= " + A + "B= " + B);
		}
	}

	public StaticInitilaizer() {
		System.out.println("this is StaticInitilaizer called");
	} // constructor is called only after static initializer block

	public static void main(String[] args) {
		StaticInitilaizer s = new StaticInitilaizer();
	}
}

interface A1 extends C1, B1{

}

interface E1 extends C1, B1{

}

interface B1 {

}

interface C1 {

}
interface D1 {

}