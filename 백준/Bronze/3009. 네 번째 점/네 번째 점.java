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
		int[] a = new int[2];
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] b = new int[2];
		b[0] = Integer.parseInt(st.nextToken());
		b[1] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] c = new int[2];
		c[0] = Integer.parseInt(st.nextToken());
		c[1] = Integer.parseInt(st.nextToken());
		int[] d = new int[2];
		d[0] = a[0] ^ b[0] ^ c[0];
		d[1] = a[1] ^ b[1] ^ c[1];
		bw.write(d[0] + " " + d[1] + "\n");
		bw.flush();
		br.close();
	}
}