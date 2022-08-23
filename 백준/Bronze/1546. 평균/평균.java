import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		double[] p = new double[n];
		double max = 0;
		double a = 0;
		for (int i = 0; i < n; i++) {
			p[i] = Double.parseDouble(sc.next());
			a = p[i];
			if (max < a) {
				max = a;
			}
		}
		double avg = 0;
		for (int i = 0; i < n; i++) {
			p[i] = p[i] / max * 100;
			avg += p[i];
		}
		avg = avg / (double) n;
		System.out.println(avg);
		sc.close();
	}
}