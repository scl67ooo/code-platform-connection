import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] subject = new String[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			subject[i] = st.nextToken();
		}
		int min = 64;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				char[][] partOfSubject = new char[8][8];
				for (int k = 0; k < 8; k++) {
					partOfSubject[k] = subject[i + k].substring(j, j + 8).toCharArray();
				}
				if (min > checkDiff(partOfSubject)) {
					min = checkDiff(partOfSubject);
				}
			}
		}
		bw.write(min + "\n");
		bw.flush();
		br.close();
	}

	public static int checkDiff(char[][] partOfSubject) {
		char[] wb = "WBWBWBWB".toCharArray();
		char[] bw = "BWBWBWBW".toCharArray();

		int wbCount = 0;
		int bwCount = 0;

		for (int i = 0; i < partOfSubject.length; i++) {
			char[] compare = null;
			if (i % 2 == 0) {
				compare = wb;
			} else {
				compare = bw;
			}
			for (int j = 0; j < partOfSubject[i].length; j++) {
				if (compare[j] != partOfSubject[i][j]) {
					wbCount++;
				}
			}
		}
		for (int i = 0; i < partOfSubject.length; i++) {
			char[] compare = null;
			if (i % 2 == 0) {
				compare = bw;
			} else {
				compare = wb;
			}
			for (int j = 0; j < partOfSubject[i].length; j++) {
				if (compare[j] != partOfSubject[i][j]) {
					bwCount++;
				}
			}
		}
		if (bwCount <= wbCount) {
			return bwCount;
		} else {
			return wbCount;
		}
	}
}