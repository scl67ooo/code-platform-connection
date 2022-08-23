import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int linecount = 0; linecount < lines; linecount++) {
			int n = sc.nextInt();
			int[] students = new int[n];
			double avg = 0;
			for (int i = 0; i < n; i++) {
				students[i] = sc.nextInt();
				avg += students[i];
			}
			avg /= (double) n;
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (students[i] > avg) {
					count++;
				}
			}
			double result = (double) count / n * 100;
			System.out.printf("%.3f%%%n", result);
		}
		sc.close();
	}
}