import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] request = new int[n];
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder result = new StringBuilder();
		int max = 0;
		int formerMax = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			request[i] = p;
		}
		for (int i = 0; i < n; i++) {
			int p = request[i];
			if (max < p) {
				formerMax = max;
				max = p;
				for (int j = formerMax + 1; j <= max; j++) {
					queue.push(j);
					result.append("+\n");
				}
			}
			if (queue.peek() == p) {
				queue.pop();
				result.append("-\n");
			} else {
				result = new StringBuilder("NO\n");
				break;
			}
		}
		bw.write(result.toString());
		bw.flush();
		br.close();
	}
}