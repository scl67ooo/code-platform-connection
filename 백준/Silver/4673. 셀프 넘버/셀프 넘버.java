import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i <= 20000; i++) {
			set.add(i);
		}
		for (int j = 1; j <= 20000; j++) {
			set.remove(oneStep(j));
		}
		for (int k : set) {
			if (k > 10000) {
				break;
			}
			System.out.println(k);
		}
		sc.close();
	}

	public static int oneStep(int start) {
		int sum = 0;
		int n = start;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return (start + sum);
	}
}