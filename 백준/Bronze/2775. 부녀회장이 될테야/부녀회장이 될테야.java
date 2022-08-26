import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] count = new int[k + 1][n];
			for (int currentFloor = 0; currentFloor <= k; currentFloor++) {
				if (currentFloor == 0) {
					for (int line = 1; line <= n; line++) {
						count[currentFloor][line - 1] = line;
					}
				} else {
					for (int line = 1; line <= n; line++) {
						int sum = 0;
						for (int localLine = 1; localLine <= line; localLine++) {
							sum += count[currentFloor - 1][localLine - 1];
						}
						count[currentFloor][line - 1] = sum;
					}
				}
			}
			System.out.println(count[k][n - 1]);
		}
		sc.close();
	}
}