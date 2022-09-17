import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		String s = st.nextToken();
		if (s.equals("1 2 3 4 5 6 7 8")) {
			bw.write("ascending\n");
		} else if (s.equals("8 7 6 5 4 3 2 1")) {
			bw.write("descending\n");
		} else {
			bw.write("mixed\n");
		}
		bw.flush();
		bw.close();
	}
}