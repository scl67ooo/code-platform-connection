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

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] triangle = new int[3];
			for (int i = 0; i < triangle.length; i++) {
				triangle[i] = Integer.parseInt(st.nextToken());
			}
			if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) {
				break;
			}
			Arrays.sort(triangle);
			if (triangle[0] * triangle[0] + triangle[1] * triangle[1] == triangle[2] * triangle[2]) {
				bw.write("right" + "\n");
			} else {
				bw.write("wrong" + "\n");
			}
			bw.flush();
		}
		br.close();
	}
}