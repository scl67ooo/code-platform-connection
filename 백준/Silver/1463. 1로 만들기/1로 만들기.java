import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] array = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (i % 6 == 0) {
				array[i] = Math.min(Math.min(array[i / 3], array[i / 2]), array[i - 1]) + 1;
			} else if (i % 3 == 0) {
				array[i] = Math.min(array[i / 3], array[i - 1]) + 1;
			} else if (i % 2 == 0) {
				array[i] = Math.min(array[i / 2], array[i - 1]) + 1;
			} else {
				array[i] = array[i - 1] + 1;
			}
		}
		bw.write(array[n] + "\n");
		bw.flush();
		br.close();
	}
}