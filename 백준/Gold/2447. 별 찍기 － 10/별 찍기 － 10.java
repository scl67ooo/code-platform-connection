import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double beforeRep = Math.log10(n) / Math.log10(3);
		if ((int) beforeRep != beforeRep) {
			sc.close();
			return;
		}
		int rep = (int) beforeRep;
		String[] array = sponge(rep);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}

	public static String[] sponge(int n) {
		if (n == 1) {
			String[] array = new String[3];
			array[0] = "***";
			array[1] = "* *";
			array[2] = "***";
			return array;
		} else {
			String[] beforeAdd = sponge(n - 1);
			String[] afterAdd = new String[beforeAdd.length * 3];
			for (int i = 0; i < afterAdd.length; i++) {
				if (i >= beforeAdd.length && i < beforeAdd.length * 2) {
					afterAdd[i] = beforeAdd[i % beforeAdd.length]
							+ new String(new char[beforeAdd.length]).replace('\0', ' ')
							+ beforeAdd[i % beforeAdd.length];
				} else {
					afterAdd[i] = beforeAdd[i % beforeAdd.length] + beforeAdd[i % beforeAdd.length]
							+ beforeAdd[i % beforeAdd.length];
				}
			}
			return afterAdd;
		}
	}
}