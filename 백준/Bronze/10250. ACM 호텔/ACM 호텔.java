import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		for (int i = 0; i < t; i++) {
			int h = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next());
			int n = Integer.parseInt(sc.next());
			String result = "";
			if (n % h == 0) {
				result = h + String.format("%02d", (n / h));
			} else {
				result = (n % h) + String.format("%02d", (n / h)+1);
			}
			System.out.println(result);
		}
		sc.close();
	}
}