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
		int n = Integer.parseInt(st.nextToken());
		String[] intToStr = new String[n];
		HashMap<String, Integer> strToInt = new HashMap<>();
		int m = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String entry = st.nextToken();
			intToStr[i] = entry;
			strToInt.put(entry, i);
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			String question = st.nextToken();
			try {
				int p = Integer.parseInt(question);
				bw.write(intToStr[p - 1] + "\n");
			} catch (NumberFormatException e) {
				bw.write(strToInt.get(question) + 1 + "\n");
			}
		}
		bw.flush();
		br.close();
	}
}