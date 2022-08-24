import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			int repeat = Integer.parseInt(sc.next());
			String letter = sc.next();
			for (int j = 0; j < letter.length(); j++) {
				for (int k = 0; k < repeat; k++) {
					System.out.print("" + letter.charAt(j));
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}