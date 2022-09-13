import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		int[] afterParse = new int[n - 1];
		int gcd = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n - 1; i++) {
			afterParse[i] = Math.abs(array[i + 1] - array[i]);
			if (gcd == 0) {
				gcd = afterParse[i];
			} else {
				gcd = gcd(gcd, afterParse[i]);
			}
		}
		Set<Integer> factorsOfGcd = factors(gcd);
		for (int f : factorsOfGcd) {
			bw.write(f + " ");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}

	public static int lcm(int p, int q) {
		return p * q / gcd(p, q);
	}

	public static Set<Integer> factors(int n) {
		int root = (int) Math.sqrt(n + 1);
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 1; i <= root; i++) {
			if (n % i == 0) {
				set.add(i);
				set.add(n / i);
			}
		}
		set.remove(1);
		return set;
	}
}