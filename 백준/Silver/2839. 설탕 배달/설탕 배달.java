import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int all5 = sc.nextInt();
		int all3 = 0;
		int result = 0;
		while (true) {
			if (all5 % 5 != 0) {
				all5 -= 3;
				all3 += 3;
			}
			if (all5 % 5 == 0) {
				result = (all5 / 5) + (all3 / 3);
				break;
			}
			if (all5 < 0) {
				result = -1;
				break;
			}
		}
		System.out.println(result);
		sc.close();
	}
}