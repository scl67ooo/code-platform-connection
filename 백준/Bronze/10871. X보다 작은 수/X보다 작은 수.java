import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			int compare = Integer.parseInt(sc.next());
			if (compare < x) {
				System.out.print(compare+" ");
			}
		}
		System.out.println("");
	}
}