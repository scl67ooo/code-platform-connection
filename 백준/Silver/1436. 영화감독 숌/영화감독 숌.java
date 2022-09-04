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
		int count = 0;
		int i = 0;
		while (true) {
			if (checkDoom(i)) {
				count++;
			}
			if (count == n) {
				bw.write(i + "\n");
				break;
			}
			i++;
		}
		bw.flush();
		br.close();
	}

	public static boolean checkDoom(int n) {
		String nl = n + "";
		if (nl.contains("666")) {
			return true;
		} else {
			return false;
		}
	}
}