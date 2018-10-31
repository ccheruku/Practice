import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwapsForSorting {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int arrLen = arr.length;
        int count = 0;
        int [] sarr = arr.clone();
        Arrays.sort(sarr);
        
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] != sarr[i]) {
                count++;
                for (int j = i + 1; j < arrLen; j++) {
                    if (arr[j] == sarr[i] ) {
                        int tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                        break;
                    }
                }
            }
        }
        return count;
	}

	private static final Scanner scanner = new Scanner("7\n1 3 5 2 4 6 8");

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/git/Practice/test.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
