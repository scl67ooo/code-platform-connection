import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {			
			array[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(array);
		bw.write(array[n-k]+"\n");

		bw.flush();
		br.close();
	}
}