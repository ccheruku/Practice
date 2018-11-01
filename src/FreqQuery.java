import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqQuery {

	// Complete the freqQuery function below.
	static List<Integer> freqQuery(List<List<Integer>> queries) {
		final Map<Integer, Integer> valueToFreq = new HashMap<>();
		final Map<Integer, Integer> freqToOccurrence = new HashMap<>();
		final List<Integer> frequencies = new ArrayList<>();

		Integer key;
		Integer value;
		Integer oldFreq;
		Integer newFreq;
		Integer oldOccurrence;
		Integer newOccurrence;
		  for (List<Integer> query : queries) {
			key = query.get(0);
			value =  query.get(1);
			switch (key) {
			case 3:
				if (value == 0) {
					frequencies.add(1);
				}
				frequencies.add(freqToOccurrence.get(value) == null ? 0 : 1);
				break;
			default:
				oldFreq = valueToFreq.get(value);
				oldFreq = oldFreq == null ? 0 : oldFreq;
				oldOccurrence = freqToOccurrence.get(oldFreq);
				oldOccurrence = oldOccurrence == null ? 0 : oldOccurrence;

				if (key == 1) {
					newFreq = oldFreq + 1;
				} else {
					newFreq = oldFreq - 1;
				}
				newOccurrence = freqToOccurrence.get(newFreq);
				newOccurrence = newOccurrence == null ? 0 : newOccurrence;

				if (newFreq < 1) {
					valueToFreq.remove(value);
				} else {
					valueToFreq.put(value, newFreq);
				}

				if ((oldOccurrence - 1) < 1) {
					freqToOccurrence.remove(oldFreq);
				} else {
					freqToOccurrence.put(oldFreq, oldOccurrence - 1);
				}
				freqToOccurrence.put(newFreq, newOccurrence + 1);
			}
		}
		return frequencies;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> queries = new ArrayList<>();

		for (int i = 0; i < q; i++) {
			String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> queriesRowItems = new ArrayList<>();

			for (int j = 0; j < 2; j++) {
				int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
				queriesRowItems.add(queriesItem);
			}

			queries.add(queriesRowItems);
		}

		List<Integer> ans = freqQuery(queries);

		for (int i = 0; i < ans.size(); i++) {
			bufferedWriter.write(String.valueOf(ans.get(i)));

			if (i != ans.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
