import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			q.add(i + 1);
		}
		while (true) {
			if (q.size() == 1){
				bw.write(q.get(0)+"\n");
				break;
			}
			q.add(q.get(1));
			q.remove(0);
			q.remove(1);
		}
		bw.flush();
		br.close();
	}
}