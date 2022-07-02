import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int q = 0;
        if (a > 0) {
            if (b > 0) {
                q = 1;
            } else if (b < 0) {
                q = 4;
            }
        } else if (a < 0) {
            if (b > 0) {
                q = 2;
            } else if (b < 0) {
                q = 3;
            }
        }
        System.out.println(q);
    }
}