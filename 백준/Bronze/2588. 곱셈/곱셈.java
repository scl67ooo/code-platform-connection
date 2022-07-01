import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l1 = sc.next();
		int hundred = Integer.parseInt(l1);
		int[] nn = new int[3];
		String l2 = sc.next();
		for (int i = 0; i < 3; i++) {
			nn[i] = Integer.parseInt(Character.toString(l2.charAt(i)));
		}
		sc.close();
		int sum = 0;
		for (int i = 0; i < nn.length; i++) {
			int calc = hundred * nn[nn.length - i - 1];
			System.out.println(calc);
			sum += calc * ((int) Math.pow(10,i));
		}
		System.out.println(sum);
	}
}