import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		bw.write(gRatio(n) + "\n");
		bw.flush();
		bw.close();
		sc.close();
	}

	public static int gRatio(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return gRatio(n - 2) + gRatio(n - 1);
		}
	}
}