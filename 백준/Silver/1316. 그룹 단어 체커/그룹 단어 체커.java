import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			String input = sc.next();
			if (checkGroupWord(input)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	public static boolean checkGroupWord(String input) {
		char[] array = new char[input.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.charAt(i);
		}
		for (int j = array.length - 1; j > 0; j--) {
			if (array[j] == array[j - 1]) {
				array[j] = ' ';
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j] && array[i] != ' ') {
					return false;
				}
			}
		}
		return true;
	}
}