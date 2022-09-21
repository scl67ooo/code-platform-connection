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
		int l = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		char[] seq = st.nextToken().toCharArray();
		long prime = 1234567891L;
		long sum = 0;
		for (int i = 0; i < l; i++) {
			long pow = 1;
			for (int j = 0; j < i; j++) {
				pow = (pow * 31) % prime;
			}
			sum += ((seq[i] - 96) * pow) % prime;
		}
		long hash = sum % prime;
		bw.write(hash + "\n");
		bw.flush();
		br.close();
	}
}