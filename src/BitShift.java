public class BitShift {
	public static void main(String[] args) {
		/*
		 * int x = 0x80000000; System.out.print(x + " and  "); x = x >>> 31;
		 * System.out.println(x);
		 */

		int[][][] x = new int[3][][];
		int i, j;
		x[0] = new int[4][];
		x[1] = new int[2][];
		x[2] = new int[5][];
		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[i].length; j++) {
				x[i][j] = new int[i + j + 1];
				System.out.println("size = " + x[i][j].length);
			}
		}

	}
}