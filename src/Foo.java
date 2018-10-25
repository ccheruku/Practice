public class Foo {
	public static void main(String[] args) throws Exception {
		java.io.PrintWriter out = new java.io.PrintWriter();
		new java.io.OutputStreamWriter(System.out, true);
		out.println("Hello");
	}
}