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
		int k = Integer.parseInt(st.nextToken());
		LinkedList<Integer> result = new LinkedList<>();
		LinkedList<Integer> circle = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			circle.add(i);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				if (j == k - 1) {
					result.add(circle.poll());
				} else {
					circle.add(circle.poll());
				}
			}
		}
		bw.write("<" + result.get(0));
		for (int i = 1; i < result.size(); i++) {
			bw.write(", " + result.get(i));
		}
		bw.write(">");
		bw.flush();
		br.close();
	}
}