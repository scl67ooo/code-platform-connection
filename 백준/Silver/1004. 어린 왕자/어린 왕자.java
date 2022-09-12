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
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int count = 0;
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				int xp = Integer.parseInt(st.nextToken());
				int yp = Integer.parseInt(st.nextToken());
				int rp = Integer.parseInt(st.nextToken());
				if ((Math.pow(x1 - xp, 2) + Math.pow(y1 - yp, 2) < rp * rp)
						^ (Math.pow(x2 - xp, 2) + Math.pow(y2 - yp, 2) < rp * rp)) {
					count++;
				}
			}
			bw.write(count + "\n");
		}
		bw.flush();
		br.close();
	}
}