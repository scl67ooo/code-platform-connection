import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] cards = new int[n];
		int max = 0;
		for (int i=0;i<n;i++){
			cards[i]=Integer.parseInt(st.nextToken());
		}		
		
		List<int[]> combinations = generate(n, 3);
		for (int[] combination : combinations) {
			int cardSum = 0;
			for (int cardIndex : combination) {
				cardSum += cards[cardIndex];
			}
			if (cardSum <= m && cardSum > max) {
				max = cardSum;
			}
		}
		bw.write(max+"\n");
		bw.flush();
		bw.close();
	}

	private static void helper(List<int[]> combinations, int data[], int start, int end, int index) {
		if (index == data.length) {
			int[] combination = data.clone();
			combinations.add(combination);
		} else if (start <= end) {
			data[index] = start;
			helper(combinations, data, start + 1, end, index + 1);
			helper(combinations, data, start + 1, end, index);
		}
	}

	public static List<int[]> generate(int n, int r) {
		List<int[]> combinations = new ArrayList<>();
		helper(combinations, new int[r], 0, n - 1, 0);
		return combinations;
	}
}