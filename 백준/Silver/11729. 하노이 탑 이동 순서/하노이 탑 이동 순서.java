import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String[] array = hanoi(1, 3, n);
		bw.write(array.length + "\n");
		for (int i = 0; i < array.length; i++) {
			bw.write(array[i] + "\n");
		}
		bw.flush();
		bw.close();
	}

	public static String[] hanoi(int from, int to, int n) {
		if (n == 1) {
			String[] array = new String[1];
			array[0] = from + " " + to;
			return array;
		} else {
			int another = 6 - from - to;
			String[] beforeAdd1 = hanoi(from, another, n - 1);
			String[] afterAdd = new String[2 * beforeAdd1.length + 1];
			String[] beforeAdd2 = hanoi(another, to, n - 1);
			for (int i = 0; i < beforeAdd1.length; i++) {
				afterAdd[i] = beforeAdd1[i];
			}
			afterAdd[beforeAdd1.length] = from + " " + to;
			for (int i = beforeAdd1.length + 1; i < afterAdd.length; i++) {
				afterAdd[i] = beforeAdd2[i - 1 - beforeAdd1.length];
			}
			return afterAdd;
		}
	}
}