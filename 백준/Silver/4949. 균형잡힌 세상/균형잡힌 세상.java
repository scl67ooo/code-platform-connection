import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ".");
			String s = "";
			try {
				s = st.nextToken();
			} catch (NoSuchElementException e){
				break;
			}
			s = s.replaceAll("[^\\Q()[]\\E]","");
			while (true) {
				String before = s;
				s = s.replaceAll("\\Q[]\\E", "").replaceAll("\\Q()\\E", "");
				if (before.equals(s)) {
					break;
				}
			}
			if (s.equals("")) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
			bw.flush();
		}
		br.close();
	}
}