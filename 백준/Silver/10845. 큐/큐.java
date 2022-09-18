import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		LinkedList<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				q.add(x);
			} else if (s.equals("pop")) {
				try {
					Integer polled = q.poll();
					if (polled == null) {
						throw new Exception();
					}
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
					Integer front = q.peekFirst();
					if (front == null) {
						throw new Exception();
					}
					bw.write(front + "\n");
				} catch (Exception e) {
					bw.write("-1\n");
				} finally {
					bw.flush();
				}
			} else if (s.equals("back")) {
				try {
					Integer back = q.peekLast();
					if (back == null) {
						throw new Exception();
					}
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