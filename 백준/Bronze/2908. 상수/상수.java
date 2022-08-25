import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n1 = reverse(sc.next());
		int n2 = reverse(sc.next());
		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		sc.close();
	}

	public static int reverse(String l) {
		String lx = "";
		for (int i = l.length() - 1; i >= 0; i--) {
			lx = lx + l.charAt(i);
		}
		return Integer.parseInt(lx);
	}
}