import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		if (c <= b) {
			result = -1;
		} else {
			result = (int) Math.floor((double) a / (double) (c - b)) + 1;
		}
		System.out.println(result);
		sc.close();
	}
}