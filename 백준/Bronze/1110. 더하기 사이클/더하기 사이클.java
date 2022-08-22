import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = n;
		int count = 0;
		while (true) {
			a = (a % 10) * 10 + ((a / 10) + (a % 10)) % 10;
			count++;
			if (n == a) {
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}