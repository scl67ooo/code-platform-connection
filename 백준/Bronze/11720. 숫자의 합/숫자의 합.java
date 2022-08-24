import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String opening = sc.next();
		String question = sc.next();
		int sum = 0;
		for (int i = 0; i < question.length(); i++) {
			sum += Integer.parseInt(""+question.charAt(i));
		}
		System.out.println(sum);
		sc.close();
	}
}