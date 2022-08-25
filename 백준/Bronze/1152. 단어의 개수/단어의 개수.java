import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String input = sc.next().trim();
		int spaces = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				spaces++;
			}
		}
		if (input.equals("")) {
			System.out.println(0);
		} else {
			System.out.println(spaces + 1);
		}
		sc.close();
	}
}