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
		int length = 5;
		int[] serial = new int[length];
		int sum = 0;
		for (int i = 0; i < length; i++) {
			serial[i] = Integer.parseInt(st.nextToken());
			sum += serial[i] * serial[i];
		}
		bw.write(sum % 10 + "\n");
		bw.flush();
		bw.close();
	}
}