import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int an = Integer.parseInt(st.nextToken());
		int bn = Integer.parseInt(st.nextToken());
		Set<Integer> aSet = new HashSet<>();
		Set<Integer> bSet = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < an; i++) {
			aSet.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < bn; i++) {
			bSet.add(Integer.parseInt(st.nextToken()));
		}

		Set<Integer> amb = new HashSet<>(aSet);
		amb.removeAll(bSet);
		
		Set<Integer> bma = new HashSet<>(bSet);
		bma.removeAll(aSet);
		amb.addAll(bma);
		bw.write(amb.size() + "\n");
		bw.flush();
		br.close();
	}
}