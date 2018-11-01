import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountTriplets {

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
		Map<Long, Long> rightMap = getOccurenceMap(arr);
        Map<Long, Long> leftMap = new TreeMap<>();
        long numberOfGeometricPairs = 0;
    
        for (long val : arr) {
          long countLeft = 0;
          long countRight = 0;
          long lhs = 0;
          long rhs = val * r;
          if (val % r == 0) {
            lhs = val / r;
          }
          Long occurence = rightMap.get(val);
          rightMap.put(val, occurence - 1L);

          if (rightMap.containsKey(rhs)) {
            countRight = rightMap.get(rhs);
          }
          if (leftMap.containsKey(lhs)) {
            countLeft = leftMap.get(lhs);
          }
          numberOfGeometricPairs += countLeft * countRight;
          insertIntoMap(leftMap, val);
        }
        return numberOfGeometricPairs;
    }
    
    private static Map<Long, Long> getOccurenceMap(List<Long> test) {
        Map<Long, Long> occurenceMap = new TreeMap<>();
        for (long val : test) {
            insertIntoMap(occurenceMap, val);
        }
       return occurenceMap;
    }
  
    private static void insertIntoMap(Map<Long, Long> occurenceMap, Long val) {
        if (!occurenceMap.containsKey(val)) {
            occurenceMap.put(val, 1L);
          } else {
            Long occurence = occurenceMap.get(val);
            occurenceMap.put(val, occurence + 1L);
          }
    }

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nr[0]);

		long r = Long.parseLong(nr[1]);

		String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Long> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			long arrItem = Long.parseLong(arrItems[i]);
			arr.add(arrItem);
		}

		long ans = countTriplets(arr, r);

		bufferedWriter.write(String.valueOf(ans));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
