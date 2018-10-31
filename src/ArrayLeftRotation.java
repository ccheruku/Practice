import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayLeftRotation {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		int actualRotations = d % a.length;
		int newArray[]      = new int[a.length];
		int currentIndex    = 0;

		for (int i = actualRotations ; i < a.length ; i++ ) {
			newArray[currentIndex] = a[i];
			currentIndex++;
		}

		for (int i = 0; i < actualRotations; i++ ) {
			newArray[currentIndex] = a[i];
			currentIndex++;
		}

		return newArray;
	}

	private static final Scanner scanner = new Scanner("5 4\n1 2 3 4 5");

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/git/Practice/test.txt"));

		String[] nd = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nd[0]);
		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;

		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
