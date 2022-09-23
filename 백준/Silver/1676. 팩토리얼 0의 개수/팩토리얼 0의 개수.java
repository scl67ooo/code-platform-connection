import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		char[] factSeq = (fact(n) + "").toCharArray();
		int count = 0;
		boolean zeroEnabled = false;
		for (int i = factSeq.length - 1; i >= 0; i--) {
			if (!zeroEnabled) {
				if (factSeq[i] == '0') {
					zeroEnabled = true;
					count++;
				}
			} else {
				if (factSeq[i] == '0') {
					count++;
				} else {
					break;
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
		br.close();
	}

	public static BigInteger fact(int n) {
		if (n <= 1) {
			return new BigInteger("1");
		} else {
			return fact(n - 1).multiply(new BigInteger(n + ""));
		}
	}
}