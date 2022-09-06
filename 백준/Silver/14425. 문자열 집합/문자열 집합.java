import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String[] s = new String[n];
		int m = Integer.parseInt(st.nextToken());
		String[] array = new String[m];
		int count = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			s[i] = st.nextToken();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = st.nextToken();
			for (int j = 0; j < n; j++) {
				if (array[i].equals(s[j])) {
					count++;
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
		br.close();
	}
}