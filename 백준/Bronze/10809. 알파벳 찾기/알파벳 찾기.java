import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		for (int i = 97; i < 123; i++) {
			System.out.print(p.indexOf("" + (char) i) + " ");
		}
		System.out.println("");
		sc.close();
	}
}