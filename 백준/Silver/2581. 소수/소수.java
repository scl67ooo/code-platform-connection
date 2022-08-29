import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		int min = 0;
		int sum = 0;
		int[] eratosthenes = makeEratosthenes(n);
		for (int i = m; i <= n; i++) {
			if (eratosthenes[i - 1] == 1) {
				sum += i;
				if (count == 0) {
					min = i;
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
	}

	public static int[] makeEratosthenes(int input) {
		int[] array = new int[input];
		for (int i = 0; i < input; i++) {
			if (i == 0) {
				array[i] = 0;
			} else {
				array[i] = 1;
				for (int j = 2; j < i; j++) {
					if ((i + 1) % j == 0) {
						array[i] = 0;
					}
				}
			}
		}
		return array;
	}
}