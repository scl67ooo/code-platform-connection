import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int s = 1;
		while (true) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			if (a == 0 && b == 0 ){
				return;
			} else {
				System.out.println(a+b);
			}
		}
	}
}