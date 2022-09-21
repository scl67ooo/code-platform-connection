import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static long recursion(long[] trees, int n, int m, long min, long max) {
		long mid = (min + max) / 2;
		if (min > max)
			return max;
		long resultWood = 0;
		for (int i = 0; i < n; i++) {
			if (trees[i] < mid) {
			} else {
				resultWood += trees[i] - mid;
			}
		}
		if (resultWood >= m) {
			return recursion(trees, n, m, mid + 1, max);
		} else {
			return recursion(trees, n, m, min, mid - 1);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[] trees = new long[n];
		long maxMinusM = 0;
		long result = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			trees[i] = Long.parseLong(st.nextToken());
			if (maxMinusM < trees[i]) {
				maxMinusM = trees[i];
			}
		}
		long zeroHeight = maxMinusM;
		maxMinusM -= m;
		if (maxMinusM < 0) {
			maxMinusM = 0;
		}
		result = recursion(trees, n, m, maxMinusM, zeroHeight);
		bw.write(result + "\n");
		bw.flush();
		br.close();
	}
}