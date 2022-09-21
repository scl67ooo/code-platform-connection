import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static boolean checkHigherPriority(Queue<Entry<Integer, Integer>> queue, int priority) {
		for (Map.Entry<Integer, Integer> queueSet : queue) {
			if (priority < queueSet.getValue()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			Queue<Entry<Integer, Integer>> queue = new LinkedList<Map.Entry<Integer, Integer>>();
			for (int j = 0; j < n; j++) {
				queue.add(new AbstractMap.SimpleEntry<>(j, Integer.parseInt(st.nextToken())));
			}
			int count = 0;
			while (true) {
				Map.Entry<Integer, Integer> queueEntry = queue.peek();
				if (checkHigherPriority(queue, queueEntry.getValue())) {
					queue.add(queue.poll());
				} else {
					if (queueEntry.getKey().equals(m)) {
						count++;
						bw.write(count + "\n");
						break;
					} else {
						queue.poll();
						count++;
					}
				}
			}
		}
		bw.flush();
		br.close();
	}
}