import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static String recursion(String s, int l, int r) {
		if (l >= r)
			return "yes";
		else if (s.charAt(l) != s.charAt(r))
			return "no";
		else
			return recursion(s, l + 1, r - 1);
	}

	public static String isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("0")){
				break;
			}
			bw.write(isPalindrome(s)+"\n");
		}

		bw.flush();
		br.close();
	}
}