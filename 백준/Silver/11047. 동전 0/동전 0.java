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
		int k = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
		}
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			count += k / array[i];
			k %= array[i];
			if (k == 0) {
				break;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		br.close();
	}
}