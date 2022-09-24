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
		int t = Integer.parseInt(st.nextToken());
		int max = 0;
		int[] task = new int[t];
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			task[i] = Integer.parseInt(st.nextToken());
			max = Math.max(task[i], max);
		}
		long[] array = new long[max + 1];
		// array[0] = 0;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		array[4] = 2;
		array[5] = 2;
		for (int i = 6; i <= max; i++) {
			array[i] = array[i - 5] + array[i - 1];
		}
		for (int i = 0; i < t; i++) {
			bw.write(array[task[i]] + "\n");
		}
		bw.flush();
		br.close();
	}
}