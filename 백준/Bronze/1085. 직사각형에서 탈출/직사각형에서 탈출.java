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
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min = 1000;
		int comp;
		if (h - y < y) {
			comp = h - y;
		} else {
			comp = y;
		}
		if (min > comp) {
			min = comp;
		}
		if (w - x < x) {
			comp = w - x;
		} else {
			comp = x;
		}
		if (min > comp) {
			min = comp;
		}
		bw.write(min + "\n");
		bw.flush();
		br.close();
	}
}