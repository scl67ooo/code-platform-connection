import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Deque<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push_back")) {
				int x = Integer.parseInt(st.nextToken());
				q.addLast(x);
			} else if (s.equals("push_front")) {
				int x = Integer.parseInt(st.nextToken());
				q.addFirst(x);
			} else if (s.equals("pop_back")) {
				try {
					Integer polled = q.removeLast();
					bw.write(polled + "\n");
				} catch (Exception e) {
					bw.write("-1\n");
				} finally {
					bw.flush();
				}
			} else if (s.equals("pop_front")) {
				try {
					Integer polled = q.removeFirst();
					bw.write(polled + "\n");
				} catch (Exception e) {
					bw.write("-1\n");
				} finally {
					bw.flush();
				}
			} else if (s.equals("size")) {
				bw.write(q.size() + "\n");
				bw.flush();
			} else if (s.equals("empty")) {
				if (q.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				bw.flush();
			} else if (s.equals("front")) {
				try {
					Integer front = q.getFirst();
					bw.write(front + "\n");
				} catch (Exception e) {
					bw.write("-1\n");
				} finally {
					bw.flush();
				}
			} else if (s.equals("back")) {
				try {
					Integer back = q.getLast();
					bw.write(back + "\n");
				} catch (Exception e) {
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