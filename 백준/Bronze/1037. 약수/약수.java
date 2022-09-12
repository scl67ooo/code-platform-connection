import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int factorCount = Integer.parseInt(st.nextToken());
		int[] factors = new int[factorCount];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < factorCount; i++) {
			factors[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(factors);
		bw.write(factors[0] * factors[factors.length - 1] + "\n");
		bw.flush();
		br.close();
	}
}