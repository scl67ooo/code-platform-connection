import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cook = Integer.parseInt(sc.next());

		h += ((m + cook) / 60);
		if ((h / 24) > 0) {
			h %= 24;
		}
		m = ((m + cook) % 60);
		System.out.println(h + " " + m);
		sc.close();
	}
}