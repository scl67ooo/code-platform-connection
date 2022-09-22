import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.AbstractMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int[][] calcBlocks;

	public static Map.Entry<Integer, Integer> calcMax(int[][] blocks, int n, int m, int b, int min, int max) {
		int resultTime = 128000000;
		int resultHeight = max;
		for (int i = max; i >= min; i--) {
			int time = adjustLand(blocks, n, m, b, i);
			if (time < resultTime && time != -1) {
				resultTime = time;
				resultHeight = i;
			}
		}
		return new AbstractMap.SimpleEntry<>(resultTime, resultHeight);
	}

	public static int adjustLand(int[][] blocks, int n, int m, int b, int target) {
		calcBlocks = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				calcBlocks[i][j] = blocks[i][j];
			}
		}
		int time = 0;
		int inventory = b;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (calcBlocks[i][j] > target) {
					calcBlocks[i][j] -= target;
					inventory += calcBlocks[i][j];
					time += 2 * calcBlocks[i][j];
					calcBlocks[i][j] = target;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (calcBlocks[i][j] < target) {
					if (inventory < (target - calcBlocks[i][j])) {
						time = -1;
						break;
					} else {
						inventory -= target - calcBlocks[i][j];
						calcBlocks[i][j] = target - calcBlocks[i][j];
						time += calcBlocks[i][j];
					}
				}
			}
		}
		return time;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][] blocks = new int[n][m];
		int max = 0;
		int min = 501;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int height = Integer.parseInt(st.nextToken());
				blocks[i][j] = height;
				if (max < height) {
					max = height;
				}
				if (min > height) {
					min = height;
				}
			}
		}
		Map.Entry<Integer, Integer> result = calcMax(blocks, n, m, b, min, max);
		bw.write(result.getKey() + " " + result.getValue() + "\n");
		bw.flush();
		br.close();
	}
}