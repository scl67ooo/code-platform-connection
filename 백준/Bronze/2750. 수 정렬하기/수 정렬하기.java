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
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n - 1; i++) {
			int select = array[i];
			int min = 1001;
			int index = 0;
			for (int j = i + 1; j < n; j++) {
				if (min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			if (min < select) {
				array[index] = select;
				array[i] = min;
			}
		}

		for (int i=0;i<n;i++){
			bw.write(array[i] + "\n");
		}		
		bw.flush();
		br.close();
	}
}