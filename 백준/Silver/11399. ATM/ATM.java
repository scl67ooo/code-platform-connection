import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int[][] array;
	public static int[][] tmp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		array = new int[n][2];
		tmp = new int[n][2];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			array[i][0] = i;
			array[i][1] = Integer.parseInt(st.nextToken());
		}

		mergeSort(0, array.length - 1);

		int waitingTime[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				waitingTime[i] = array[i][1];
			} else {
				waitingTime[i] = waitingTime[i - 1] + array[i][1];
			}
			sum += waitingTime[i];
		}

		bw.write(sum + "\n");
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
				if (q > end || (p <= mid && (array[p][1] < array[q][1]))) {
					tmp[idx][0] = array[p][0];
					tmp[idx][1] = array[p][1];
					idx++;
					p++;
				} else {
					tmp[idx][0] = array[q][0];
					tmp[idx][1] = array[q][1];
					idx++;
					q++;
				}
			}

			for (int i = start; i <= end; i++) {
				array[i][0] = tmp[i][0];
				array[i][1] = tmp[i][1];
			}
		}
	}
}