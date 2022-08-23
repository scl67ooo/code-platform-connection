import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for (int linecount = 0; linecount < n; linecount++) {
			String seq = sc.next();
			int[] scoreArray = new int[seq.length()];
			int scoreSum = 0;
			for (int i = 0; i < scoreArray.length; i++) {
				if (seq.charAt(i) == 'O' && i == 0) {
					scoreArray[i] = 1;
				} else if (seq.charAt(i) == 'O') {
					scoreArray[i] = scoreArray[i - 1] + 1;
				}
				scoreSum += scoreArray[i];
			}
			System.out.println(scoreSum);
		}
		sc.close();
	}
}