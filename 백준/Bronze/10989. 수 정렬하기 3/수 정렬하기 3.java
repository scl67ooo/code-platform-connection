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
		int[] array = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
			if (array[i] > max) {
				max = array[i];
			}
		}

		int[] sortArray = new int[max];
		for (int i = 0; i < array.length; i++) {
			sortArray[array[i] - 1]++;
		}
		for (int i = 0; i < sortArray.length; i++) {
			for (int j = 0; j < sortArray[i]; j++) {
				bw.write(i+1 + "\n");
			}
		}

		bw.flush();
		br.close();
	}
}