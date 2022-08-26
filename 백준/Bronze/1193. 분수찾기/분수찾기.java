import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int n = aTon(input);
		int a = nToa(n);
		int x = a - input + 1;
		int y = (n + 1) - x;
		if (n % 2 == 1) {
			System.out.println(x + "/" + y);
		} else {
			System.out.println(y + "/" + x);
		}
		sc.close();
	}

	public static int nToa(int n) {
		int a = n * (n + 1) / 2;
		return a;
	}

	public static int aTon(int a) {
		double n = Math.sqrt(2 * a + 0.25) - 0.5;
		return (int) Math.ceil(n);
	}
}