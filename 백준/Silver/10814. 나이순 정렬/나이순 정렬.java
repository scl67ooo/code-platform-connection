import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static String[][] tmp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String[][] array = new String[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = st.nextToken();
			array[i][1] = st.nextToken();
		}

		merge_sort(array);

		for (int i = 0; i < array.length; i++) {
			bw.write(array[i][0] + " " + array[i][1] + "\n");
		}
		bw.flush();
		br.close();
	}

	public static void merge_sort(String[][] a) {
		tmp = new String[a.length][2];
		merge_sort(a, 0, a.length - 1);
		tmp = null;
	}

	private static void merge_sort(String[][] a, int left, int right) {
		for (int size = 1; size <= right; size += size) {
			for (int l = 0; l <= right - size; l += (2 * size)) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + (2 * size) - 1, right);
				merge(a, low, mid, high);
			}
		}
	}

	private static void merge(String[][] a, int left, int mid, int right) {
		int l = left;
		int r = mid + 1;
		int idx = left;

		while (l <= mid && r <= right) {
			if (Integer.parseInt(a[l][0]) <= Integer.parseInt(a[r][0])) {
				tmp[idx][0] = a[l][0];
				tmp[idx][1] = a[l][1];
				idx++;
				l++;
			} else {
				tmp[idx][0] = a[r][0];
				tmp[idx][1] = a[r][1];
				idx++;
				r++;
			}
		}
		if (l > mid) {
			while (r <= right) {
				tmp[idx][0] = a[r][0];
				tmp[idx][1] = a[r][1];
				idx++;
				r++;
			}
		} else {
			while (l <= mid) {
				tmp[idx][0] = a[l][0];
				tmp[idx][1] = a[l][1];
				idx++;
				l++;
			}
		}

		for (int i = left; i <= right; i++) {
			a[i][0] = tmp[i][0];
			a[i][1] = tmp[i][1];
		}
	}
}