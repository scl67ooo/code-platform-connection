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
		HashSet<String> s = new HashSet<>();
		int m = Integer.parseInt(st.nextToken());
		int count = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			s.add(st.nextToken());
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			if (s.contains(st.nextToken())) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		br.close();
	}
}