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
		int k = Integer.parseInt(st.nextToken());
		int[][] array = new int[6][2];
		int[] compareArray = new int[12];
		int beforeCutWidth = 0;
		int cuttingA = 0;
		int beforeCutHeight = 0;
		int cuttingB = 0;
		boolean clockwised = true;
		int index = 0;
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < compareArray.length; i++) {
			compareArray[i] = array[i % array.length][0];
		}
		for (int i = 0; i <= compareArray.length - 4; i++) {
			if ((compareArray[i] == 4 && compareArray[i + 1] == 2 && compareArray[i + 2] == 3
					&& compareArray[i + 3] == 1) ||
					(compareArray[i] == 2 && compareArray[i + 1] == 3 && compareArray[i + 2] == 1
							&& compareArray[i + 3] == 4)
					||
					(compareArray[i] == 3 && compareArray[i + 1] == 1 && compareArray[i + 2] == 4
							&& compareArray[i + 3] == 2)
					||
					(compareArray[i] == 1 && compareArray[i + 1] == 4 && compareArray[i + 2] == 2
							&& compareArray[i + 3] == 3)) {
				clockwised = false;
				// 4 2 3 1
			} else if ((compareArray[i] == 1 && compareArray[i + 1] == 3 && compareArray[i + 2] == 2
					&& compareArray[i + 3] == 4) ||
					(compareArray[i] == 3 && compareArray[i + 1] == 2 && compareArray[i + 2] == 4
							&& compareArray[i + 3] == 1)
					||
					(compareArray[i] == 2 && compareArray[i + 1] == 4 && compareArray[i + 2] == 1
							&& compareArray[i + 3] == 3)
					||
					(compareArray[i] == 4 && compareArray[i + 1] == 1 && compareArray[i + 2] == 3
							&& compareArray[i + 3] == 2)) {
				clockwised = true;
				// 1 3 2 4
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (clockwised) {
				if (i == array.length - 1) {
					if ((array[i][0] == 1 && array[0][0] != 3) ||
							(array[i][0] == 3 && array[0][0] != 2) ||
							(array[i][0] == 2 && array[0][0] != 4) ||
							(array[i][0] == 4 && array[0][0] != 1)) {
						index = i;
					}
				} else {
					if ((array[i][0] == 1 && array[i + 1][0] != 3) ||
							(array[i][0] == 3 && array[i + 1][0] != 2) ||
							(array[i][0] == 2 && array[i + 1][0] != 4) ||
							(array[i][0] == 4 && array[i + 1][0] != 1)) {
						index = i;
					}
				}
			} else {
				if (i == array.length - 1) {
					if ((array[i][0] == 4 && array[0][0] != 2) ||
							(array[i][0] == 2 && array[0][0] != 3) ||
							(array[i][0] == 3 && array[0][0] != 1) ||
							(array[i][0] == 1 && array[0][0] != 4)) {
						index = i;
					}
				} else {
					if ((array[i][0] == 4 && array[i + 1][0] != 2) ||
							(array[i][0] == 2 && array[i + 1][0] != 3) ||
							(array[i][0] == 3 && array[i + 1][0] != 1) ||
							(array[i][0] == 1 && array[i + 1][0] != 4)) {
						index = i;
					}
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i][0] == 3 || array[i][0] == 4) {
				if (beforeCutHeight < array[i][1]) {
					beforeCutHeight = array[i][1];
				}
			}
			if (array[i][0] == 1 || array[i][0] == 2) {
				if (beforeCutWidth < array[i][1]) {
					beforeCutWidth = array[i][1];
				}
			}
		}
		cuttingA = array[index][1];
		if (index == array.length - 1) {
			cuttingB = array[0][1];
		} else {
			cuttingB = array[index + 1][1];
		}
		bw.write(((beforeCutHeight * beforeCutWidth) - (cuttingA * cuttingB)) * k + "\n");
		bw.flush();
		br.close();
	}
}