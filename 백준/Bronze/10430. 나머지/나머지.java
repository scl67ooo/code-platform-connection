import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int q[] = new int[4];
		// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		q[0] = (a + b) % c;
		q[1] = ((a % c) + (b % c)) % c;
		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		q[2] = (a * b) % c;
		q[3] = ((a % c) * (b % c)) % c;
		for (int i = 0; i < q.length; i++) {
			System.out.println(q[i]);
		}
	}
}