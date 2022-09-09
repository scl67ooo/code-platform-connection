import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Set<String> nSet = new TreeSet<>();
		Set<String> mSet = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			nSet.add(st.nextToken());
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			mSet.add(st.nextToken());
		}
		Set<String> mton = nSet;
		mton.retainAll(mSet);
		List<String> sortedList = new ArrayList<>(mton);
		Collections.sort(sortedList);
		bw.write(sortedList.size() + "\n");
		for (int i = 0; i < sortedList.size(); i++) {
			bw.write(sortedList.get(i) + "\n");
		}
		bw.flush();
		br.close();
	}
}