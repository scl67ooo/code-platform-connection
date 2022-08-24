import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toUpperCase();
		int[] count = new int[26];
		for (int i = 0; i < input.length(); i++) {
			count[input.charAt(i) - 65]++;
		}
		int max = 0;
		char maxChar = 0;
		for (int i = 0; i < 26; i++) {
			if (max < count[i]) {
				max = count[i];
				maxChar = (char) (i + 65);
			} 
		}
		max = 0;
		char maxChar2 = 0;
		for (int i = 25; i >= 0; i--) {
			if (max < count[i]) {
				max = count[i];
				maxChar2 = (char) (i + 65);
			} 
		}
		if (maxChar != maxChar2) {
			System.out.println("?");
		} else {
			System.out.println(maxChar);
		}
		sc.close();
	}
}