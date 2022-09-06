import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		HashSet<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			set.add(array[i]);
		}

		List<Integer> sorted = new ArrayList<>(set);
		Collections.sort(sorted);
		Map<Integer,Integer> sortMap = new HashMap<>();
		for (int i=0;i<sorted.size();i++){
			sortMap.put(sorted.get(i), i);
		}

		for (int i = 0; i < array.length; i++) {
			bw.write(sortMap.get(array[i]) + " ");
		}
		bw.flush();
		br.close();
	}
}