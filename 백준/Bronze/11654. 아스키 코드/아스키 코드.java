import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int a = (int) input.charAt(0);
		System.out.println(a);
		sc.close();
	}
}