import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			if (max < array[i]) {
				max = array[i];
			}
		}
		int[] eratosthenes = makeEratosthenes(max);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (eratosthenes[array[i] - 1] == 0) {
				array[i] = 0;
			} else {
				array[i] = 1;
				count++;
			}
		}
	//	for (int i = 0; i < eratosthenes.length; i++) {
	//		System.out.print(eratosthenes[i] + " ");
	//	}
	//	System.out.println("");
		System.out.println(count);
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