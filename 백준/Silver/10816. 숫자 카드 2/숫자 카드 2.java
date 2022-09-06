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
		HashMap<Integer, Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int card = Integer.parseInt(st.nextToken());
			if (map.containsKey(card)) {
				map.replace(card, map.get(card) + 1);
			} else {
				map.put(card, 1);
			}
		}
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int card = Integer.parseInt(st.nextToken());
			if (map.containsKey(card)) {
				bw.write(map.get(card) + " ");
			} else {
				bw.write("0 ");
			}
		}
		bw.flush();
		br.close();
	}
}