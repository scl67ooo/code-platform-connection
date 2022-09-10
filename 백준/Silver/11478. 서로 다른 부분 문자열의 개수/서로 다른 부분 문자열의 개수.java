import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String subj = st.nextToken();
		Set<String> set = new HashSet<>();
		for (int i = 0; i <= subj.length(); i++) {
			for (int j = i + 1; j <= subj.length(); j++) {
				set.add(subj.substring(i, j));
			}
		}
		bw.write(set.size() + "\n");
		bw.flush();
		br.close();
	}
}