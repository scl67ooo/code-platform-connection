import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> g = new ArrayList<Integer>();
		while (sc.hasNextInt()){
			int a = (Integer.parseInt(sc.next()) % 42);
			if (!g.contains(a)) {
				g.add(a);
			}
		}
		System.out.println(g.size());
		sc.close();
	}
}