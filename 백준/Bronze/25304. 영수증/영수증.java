import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int totalprice = Integer.parseInt(sc.next());
		int totalg = Integer.parseInt(sc.next());
		int compareprice = 0;
		int[] prices = new int[totalg];
		int[] counts = new int[totalg];
		for (int i = 0; i < totalg; i++) {
			prices[i] = Integer.parseInt(sc.next());
			counts[i] = Integer.parseInt(sc.next());
			compareprice += prices[i]*counts[i];
		}
		String result = (compareprice == totalprice)? "Yes" : "No";
		System.out.println(result);
	}
}