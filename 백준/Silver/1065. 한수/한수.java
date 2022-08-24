import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if (isHan(i)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	public static boolean isHan(int start) {
		int size = (int) Math.log10(start) + 1;
		int[] store = new int[size];
		int gap = 0;
		for (int i = 0; i < store.length; i++) {
			store[i] += (start % 10);
			start /= 10;
			if (i == 0) {
			} else if (i == 1) {
				gap = store[i] - store[i - 1];
			} else {
				if (gap != store[i] - store[i - 1]) {
					return false;
				}
			}
		}
		return true;
	}
}