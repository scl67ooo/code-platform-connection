import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.AbstractMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		Map.Entry<String, Integer> map = strip(n, 0);
		bw.write(map.getValue() + "\n");
		if (Integer.parseInt(map.getKey()) % 3 == 0) {
			bw.write("YES\n");
		} else {
			bw.write("NO\n");
		}
		bw.flush();
		br.close();
	}

	public static Map.Entry<String, Integer> strip(String n, int tryCount) {
		char[] seq = n.toCharArray();
		if (seq.length == 1) {
			return new AbstractMap.SimpleEntry<String, Integer>(n, tryCount);
		} else {
			int sum = 0;
			for (int i = 0; i < seq.length; i++) {
				sum += Integer.parseInt(String.valueOf(seq[i]));
			}
			return strip(sum + "", tryCount + 1);
		}
	}
}