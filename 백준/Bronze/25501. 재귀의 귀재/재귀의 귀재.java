import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int[] recursion(String s, int l, int r, int runNumber) {
		if (l >= r)
			return new int[] { 1, runNumber };
		else if (s.charAt(l) != s.charAt(r))
			return new int[] { 0, runNumber };
		else
			return recursion(s, l + 1, r - 1, runNumber + 1);
	}

	public static int[] isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1, 1);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			bw.write(isPalindrome(subject)[0] + " " + isPalindrome(subject)[1] + "\n");
		}

		bw.flush();
		br.close();
	}
}