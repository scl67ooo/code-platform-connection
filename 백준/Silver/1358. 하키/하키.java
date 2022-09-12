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
		int fieldW = Integer.parseInt(st.nextToken());
		int fieldH = Integer.parseInt(st.nextToken());
		int fieldX = Integer.parseInt(st.nextToken());
		int fieldY = Integer.parseInt(st.nextToken());
		int fieldR = fieldH / 2;
		int p = Integer.parseInt(st.nextToken());
		int count = 0;
		for (int i = 0; i < p; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if ((x >= fieldX && x <= fieldX + fieldW && y >= fieldY && y <= fieldY + fieldH)
					|| (Math.pow(x - fieldX, 2) + Math.pow(y - (fieldY + fieldR), 2) <= fieldR * fieldR)
					|| (Math.pow(x - (fieldX + fieldW), 2) + Math.pow(y - (fieldY + fieldR), 2) <= fieldR * fieldR)) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		br.close();
	}
}