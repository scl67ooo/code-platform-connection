import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = null;
		int space = 2;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int[] arrays = new int[space];
			for (int j = 0; j < space; j++) {
				arrays[j] = Integer.parseInt(st.nextToken());
			}
			bw.write(arrays[0] + arrays[1]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}