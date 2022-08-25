import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(replacer(input).length());
		sc.close();
	}

	public static String replacer(String input) {
		return input.replace("c=", "*")
				.replace("c-", "*")
				.replace("dz=", "*")
				.replace("d-", "*")
				.replace("lj", "*")
				.replace("nj", "*")
				.replace("s=", "*")
				.replace("z=", "*");
	}
}