import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int min = 1000000;
		int max = -1000000;
		int a = 0;
		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(sc.next());
			if (a < min) {
				min = a;
			}
			if (a > max) {
				max = a;
			}
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}