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
		int result = 0;
		for (int i=1;i<=1000000;i++){
			if (n == digitSum(i)) {
				result = i;
				break;
			}
		}
		bw.write(result+"\n");
		bw.flush();
		br.close();
	}

	public static int digitSum(int input) {
		int inputLength = (input + "").length();
		int result = input;
		for (int i = 0; i < inputLength; i++) {
			result += (input / Math.pow(10, i)) % 10;
		}
		return result;
	}
}