import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static HashMap<Integer, int[]> map = new HashMap<>();

	public static int[] fibonacci(int n) {
		if (n == 0) {
			return map.get(0);
		} else if (n == 1) {
			return map.get(1);
		} else {
			int[] array;
			if (map.containsKey(n)) {
				array = map.get(n);
			} else {
				array = new int[] {
						fibonacci(n - 1)[0] + fibonacci(n - 2)[0],
						fibonacci(n - 1)[1] + fibonacci(n - 2)[1],
				};
				map.put(n, array);
			}
			return array;
		}
	}

	public static void main(String[] args) throws Exception {
		map.put(0, new int[] { 0, 1 });
		map.put(1, new int[] { 1, 0 });
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int[] array = fibonacci(Integer.parseInt(st.nextToken()));
			bw.write(array[1] + " " + array[0] + "\n");
		}
		bw.flush();
		br.close();
	}
}