import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				break;
			}
			for (int i = n + 1; i <= n * 2; i++) {
				if (isItPrime(i)) {
					count++;
				}
			}
			bw.write(count + "\n");
			bw.flush();
		}
		bw.close();
		br.close();
	}

	public static boolean isItPrime(int input) {
		boolean isItPrime = true;
		if (input <= 1) {
			isItPrime = false;
			return isItPrime;
		} else {
			for (int i = 2; i * i <= input; i++) {
				if ((input % i) == 0) {
					isItPrime = false;
					break;
				}
			}
			return isItPrime;
		}
	}
}