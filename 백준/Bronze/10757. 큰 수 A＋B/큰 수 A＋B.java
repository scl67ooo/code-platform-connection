import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int carry = 0;
		int sum = 0;
		if (s1.length() > s2.length()) {
			int rep = s1.length() - s2.length();
			for (int i = 0; i < rep; i++) {
				s2 = "0".concat(s2);
			}
		} else if (s1.length() < s2.length()) {
			int rep = s2.length() - s1.length();
			for (int i = 0; i < rep; i++) {
				s1 = "0".concat(s1);
			}
		}
		char[] chars = new char[s1.length() + 1];
		Arrays.fill(chars, '*');
		StringBuilder result = new StringBuilder(new String(chars));
		for (int i = s1.length() - 1; i >= 0; i--) {
			sum = Integer.parseInt("" + s1.charAt(i)) + Integer.parseInt("" + s2.charAt(i)) + carry;
			carry = sum / 10;
			sum = sum % 10;
			result.setCharAt(i + 1, Character.forDigit(sum, 10));
		}
		if (carry == 0) {
			result.setCharAt(0, ' ');
		} else {
			result.setCharAt(0, Character.forDigit(carry, 10));
		}
		System.out.println(result.toString().trim());
		sc.close();
	}
}