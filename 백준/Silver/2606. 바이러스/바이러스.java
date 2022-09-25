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
		boolean[] array = new boolean[n];
		array[0] = true;
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int[][] list = new int[c][2];
		for (int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			int depart = Integer.parseInt(st.nextToken());
			int arrive = Integer.parseInt(st.nextToken());
			list[i][0] = depart;
			list[i][1] = arrive;

		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < c; i++) {
				if (array[list[i][0] - 1] || array[list[i][1] - 1]) {
					array[list[i][0] - 1] = true;
					array[list[i][1] - 1] = true;
				}
			}
			for (int i = c - 1; i >= 0; i--) {
				if (array[list[i][0] - 1] || array[list[i][1] - 1]) {
					array[list[i][0] - 1] = true;
					array[list[i][1] - 1] = true;
				}
			}
		}
		int count = -1;
		for (boolean infected : array) {
			if (infected) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		br.close();
	}
}