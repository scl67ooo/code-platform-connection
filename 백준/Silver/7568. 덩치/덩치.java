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
		int[][] hpw = new int[n][2];
		int[] rank = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			hpw[i][0] = Integer.parseInt(st.nextToken());
			hpw[i][1] = Integer.parseInt(st.nextToken());
			rank[i] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (hpw[i][0] > hpw[j][0] && hpw[i][1] > hpw[j][1]) {
					rank[j]++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			bw.write(rank[i] + " ");
		}
		bw.flush();
		br.close();
	}
}