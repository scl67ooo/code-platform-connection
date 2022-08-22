import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			System.out.println(a + b);
		}
	}
}