import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int length = 3;
		int[] abc = new int[length];
		int[] nums = new int[10];
		for (int i = 0; i < length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			abc[i] = Integer.parseInt(st.nextToken());
		}
		int mul = abc[0] * abc[1] * abc[2];
		int mulLength = (int) (Math.log10(mul) + 1);
		for (int i = 0; i < mulLength; i++) {
			int mod10 = mul % 10;
			nums[mod10]++;
			mul /= 10;
		}
		for (int i = 0; i < nums.length; i++) {
			bw.write(nums[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}