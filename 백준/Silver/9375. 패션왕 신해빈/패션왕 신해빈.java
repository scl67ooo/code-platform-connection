import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for (int i = 0; i < t; i++) {
			HashMap<String, Integer> clothes = new HashMap<>();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String biggerCategory = st.nextToken();
				if (clothes.containsKey(biggerCategory)) {
					clothes.replace(biggerCategory, clothes.get(biggerCategory) + 1);
				} else {
					clothes.put(biggerCategory, 1);
				}
			}
			int totalCase = 1;
			for (int cases : clothes.values()) {
				totalCase *= cases + 1;
			}
			totalCase -= 1;
			bw.write(totalCase + "\n");
		}
		bw.flush();
		br.close();
	}
}