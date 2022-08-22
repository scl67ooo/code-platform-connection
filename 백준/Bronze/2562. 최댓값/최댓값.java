import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 1;
		int maxcount = 0;
		while (sc.hasNextInt()){
			int n = Integer.parseInt(sc.next());
			if (n > max) {
				max = n;
				maxcount = count;
			}
			count++;
		}
		System.out.println(max+"\n"+maxcount);
		sc.close();
	}
}