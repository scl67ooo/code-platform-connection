import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
		int m = sc.nextInt();
		int cook = Integer.parseInt(sc.next());
		
		m += cook;
		while (m >= 60) {
			m -= 60;
			if (h == 23) {
				h -= 23;
			} else {
				h++;
			}
		}
        System.out.println(h+" "+m);
        sc.close();
    }
}