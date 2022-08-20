import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		int[] b = new int[6];
		b[0] = 1;
		b[1] = 1;
		b[2] = 2;
		b[3] = 2;
		b[4] = 2;
		b[5] = 8;
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sc.next());
			a[i] = b[i] - a[i];
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}