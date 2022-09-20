import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static long recursion(long[] wires, int n, int k, long min, long max) {
		long mid = (min + max) / 2;
		if (min > max)
			return mid;
		long sumDivide = 0;
		for (int i = 0; i < k; i++) {
			sumDivide += wires[i] / mid;
		}
		if (sumDivide >= n) {
			return recursion(wires, n, k, mid + 1, max);
		} else {
			return recursion(wires, n, k, min, mid - 1);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		long[] wires = new long[k];
		long avg = 0;
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			wires[i] = Integer.parseInt(st.nextToken());
			avg += wires[i];
		}
		avg /= n;
		long result = recursion(wires, n, k, 1, avg);
		bw.write(result + "\n");
		bw.flush();
		br.close();
	}
}