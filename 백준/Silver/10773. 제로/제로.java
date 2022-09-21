import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				stack.pop();
			} else {
				stack.push(n);
			}
		}
		int sum = 0;
		int stackSize = stack.size();
		for (int i = 0; i < stackSize; i++) {
			sum += stack.pop();
		}
		bw.write(sum + "\n");
		bw.flush();
		br.close();
	}
}