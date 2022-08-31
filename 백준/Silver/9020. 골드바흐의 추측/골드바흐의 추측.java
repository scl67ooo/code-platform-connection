import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int a = k / 2; a >= 2; a--) {
				if (isItPrime(a) && isItPrime(k - a)) {
					bw.write(a + " " + (k - a) + "\n");
					break;
				}
			}
		}
        bw.flush();
		bw.close();
		sc.close();
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