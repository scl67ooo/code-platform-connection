import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String output = null;
		if (a > b) {
            output = ">";
        } else if (a < b) {
            output = "<";
        } else if (a == b) {
            output = "==";
        } else {
            
        }
        System.out.println(output);
		sc.close();
    }
}