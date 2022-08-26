import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(aTon(input));
		sc.close();
	}

	public static int nToa(int n) {
		int a = 3*n*(n-1)+1;
		return a;
	}

	public static int aTon(int a) {
		double n = Math.sqrt((a - 0.25) / 3) + 0.5;
		return (int) Math.ceil(n);
	}
}