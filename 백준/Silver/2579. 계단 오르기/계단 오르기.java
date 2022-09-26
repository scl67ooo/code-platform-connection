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
		int[] stair = new int[n];
		int[][] maxScore = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			stair[i] = Integer.parseInt(st.nextToken());
		}
		maxScore[0][0] = stair[0];
		for (int i = 1; i < n; i++) {
			if (i - 2 >= 0) {
				maxScore[i][0] = stair[i] + Math.max(maxScore[i - 2][0], maxScore[i - 2][1]);
			} else {
				maxScore[i][0] = stair[i];
			}
			maxScore[i][1] = stair[i] + maxScore[i - 1][0];
		}

		bw.write(Math.max(maxScore[n - 1][0], maxScore[n - 1][1]) + "\n");
		bw.flush();
		br.close();
	}
}