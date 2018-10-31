import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndAnagrams {

	// Complete the sherlockAndAnagrams function below.
	static int sherlockAndAnagrams(String s) {

		Map<String, Integer> map = new HashMap<>();
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				char[] c = s.substring(i, j).toCharArray();
				Arrays.sort(c);
				String str = String.valueOf(c);
				if (map.containsKey(str))
					map.put(str, map.get(str) + 1);
				else
					map.put(str, 1);
			}
		}
		for (String key : map.keySet()) {
			n += (map.get(key) * (map.get(key) - 1)) / 2;
		}
		return n;
	}

	private static final Scanner scanner = new Scanner("1\ncdcd");

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/git/Practice/test.txt"));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = sherlockAndAnagrams(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
