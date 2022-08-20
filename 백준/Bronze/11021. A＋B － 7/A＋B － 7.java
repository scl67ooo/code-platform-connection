import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.next());
		int[] a = new int[cases];
		int[] b = new int[cases];
		for (int i = 0; i < cases; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
			System.out.println("Case #"+(i+1)+": "+(a[i]+b[i]));
		}
	}
}