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
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			String sub = "";
			while (true) {
				sub = s.replace("()", "");
				if (sub.equals(s)) {
					break;
				}
				s = sub;
			}
			if (s.equals("")) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		bw.flush();
		br.close();
	}
}