import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static String[] array;
	public static String[] tmp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			set.add(st.nextToken());
		}
		array = set.toArray(new String[set.size()]);
		tmp = new String[array.length];

		mergeSort(0, array.length - 1);

		for (int i = 0; i < array.length; i++) {
			bw.write(array[i] + "\n");
		}
		bw.flush();
		br.close();
	}

	public static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int p = start;
			int q = mid + 1;
			int idx = p;

			while (p <= mid || q <= end) {
				if (q > end || (p <= mid && (compare(array[p], array[q])))) {
					tmp[idx] = array[p];
					idx++;
					p++;
				} else {
					tmp[idx] = array[q];
					idx++;
					q++;
				}
			}

			for (int i = start; i <= end; i++) {
				array[i] = tmp[i];
			}
		}
	}

	public static boolean compare(String a, String b) {
		boolean result = false;
		if (a.length() < b.length()) {
			result = true;
		}
		if (a.length() == b.length()) {
			if (b.compareTo(a) > 0) {
				result = true;
			}
		}
		return result;
	}
}