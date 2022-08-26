import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        String[] abv = br.readLine().split(" "); 
		int a = Integer.parseInt(abv[0]);
        int b = Integer.parseInt(abv[1]);
        int v = Integer.parseInt(abv[2]);
		int result = (int) Math.ceil((double)(v-b)/(double)(a-b));
		bw.write(result+"\n");
		bw.flush();
        bw.close();
	}
}