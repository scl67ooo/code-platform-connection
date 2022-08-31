import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		for (int i = m; i <= n; i++) {
			if (isItPrime(i) == true) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static boolean isItPrime(int input) {
		boolean isItPrime = true;
        if (input <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i*i <= input; i++) {
                if ((input % i) == 0) {
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
	}
}