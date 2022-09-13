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
		int k = Integer.parseInt(st.nextToken());
		bw.write(bc(n, k)+"\n");
		bw.flush();
		bw.close();
	}

	public static int bc(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}

	public static int factorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}