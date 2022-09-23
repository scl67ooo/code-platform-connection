import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("add")) {
				int param = Integer.parseInt(st.nextToken());
				set.add(param);
			} else if (cmd.equals("remove")) {
				int param = Integer.parseInt(st.nextToken());
				set.remove(param);
			} else if (cmd.equals("check")) {
				int param = Integer.parseInt(st.nextToken());
				if (set.contains(param)) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
			} else if (cmd.equals("toggle")) {
				int param = Integer.parseInt(st.nextToken());
				if (set.contains(param)) {
					set.remove(param);
				} else {
					set.add(param);
				}
			} else if (cmd.equals("all")) {
				set.clear();
				for (int j = 1; j <= 20; j++) {
					set.add(j);
				}
			} else if (cmd.equals("empty")) {
				set.clear();
			}
		}
		bw.flush();
		br.close();
	}
}