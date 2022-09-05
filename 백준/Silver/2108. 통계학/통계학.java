import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;
		Arrays.sort(array);
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = -4001;
		int min = 4001;

		for (int i = 0; i < n; i++) {
			sum += array[i];
			if (map.containsKey(array[i])) {
				map.replace(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}

		int[] rank = new int[2];
		rank[0] = 4001;
		rank[1] = 9999;
		int b = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int strKey = entry.getKey();
			int strValue = entry.getValue();
			if (b < strValue) {
				b = strValue;
				rank[0] = strKey;
				rank[1] = 9999;
			}
			if (b == strValue) {
				if (rank[0] > strKey) {
					rank[1] = rank[0];
					rank[0] = strKey;
				}
				if (rank[0] < strKey && rank[1] > strKey) {
					rank[1] = strKey;
				}
			}
		}
		if (rank[1] == 9999) {
			rank[1] = rank[0];
		}

		bw.write(Math.round((double) sum / (double) n) + "\n");
		bw.write(array[(n - 1) / 2] + "\n");
		bw.write(rank[1] + "\n");
		bw.write((max - min) + "\n");

		bw.flush();
		br.close();
	}
}