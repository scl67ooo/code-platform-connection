import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String phoneWord = sc.next();
		int result = 0;
		for (int i = 0; i < phoneWord.length(); i++) {
			result += getTime(phoneWord.charAt(i));
		}
		System.out.println(result);
		sc.close();
	}

	public static int getTime(char c) {
		int number = 0;
		if (c == 'A' || c == 'B' || c == 'C') {
			number = 2;
		} else if (c == 'D' || c == 'E' || c == 'F') {
			number = 3;
		} else if (c == 'G' || c == 'H' || c == 'I') {
			number = 4;
		} else if (c == 'J' || c == 'K' || c == 'L') {
			number = 5;
		} else if (c == 'M' || c == 'N' || c == 'O') {
			number = 6;
		} else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
			number = 7;
		} else if (c == 'T' || c == 'U' || c == 'V') {
			number = 8;
		} else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
			number = 9;
		} else {
			number = 0;
		}
		return number + 1;
	}
}