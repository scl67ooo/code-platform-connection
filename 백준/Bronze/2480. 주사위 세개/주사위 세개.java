import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dot[] = new int[3];
		dot[0] = sc.nextInt();
		dot[1] = sc.nextInt();
		dot[2] = sc.nextInt();
		int prize = 0;
		if (dot[0] == dot[1] && dot[1] == dot[2]) {
			prize = 10000 + 1000 * dot[0];
		} else if (dot[0] == dot[1] || dot[1] == dot[2]) {
			prize = 1000 + 100 * dot[1];
		} else if (dot[2] == dot[0]) {
			prize = 1000 + 100 * dot[0];
		} else {
			Arrays.sort(dot);
			prize = 100*dot[2];
		}
		System.out.println(prize);
		sc.close();
	}
}