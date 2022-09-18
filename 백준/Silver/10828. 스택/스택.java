import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
			} else if (s.equals("pop")) {
				try {
					bw.write(stack.pop() + "\n");
				} catch (EmptyStackException e) {
					bw.write("-1\n");
				} finally {
					bw.flush();
				}
			} else if (s.equals("size")) {
				bw.write(stack.size() + "\n");
				bw.flush();
			} else if (s.equals("empty")) {
				if (stack.empty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				bw.flush();
			} else if (s.equals("top")) {
				try {
					bw.write(stack.peek() + "\n");
				} catch (EmptyStackException e) {
					bw.write("-1\n");
				} finally {
					bw.flush();
				}
			}
		}
		bw.flush();
		br.close();
	}
}