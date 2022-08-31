import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		String[] array = 재귀함수가_뭔가요(n);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}

	public static String[] 재귀함수가_뭔가요(int n) {
		if (n == 0) {
			String[] array = new String[3];
			array[0] = "\"재귀함수가 뭔가요?\"";
			array[1] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
			array[2] = "라고 답변하였지.";
			return array;
		} else {
			String[] beforeAdd = 재귀함수가_뭔가요(n - 1);
			String[] afterAdd = new String[beforeAdd.length + 5];
			afterAdd[0] = "\"재귀함수가 뭔가요?\"";
			afterAdd[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
			afterAdd[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
			afterAdd[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
			for (int i = 0; i < beforeAdd.length; i++) {
				afterAdd[i + 4] = "____".concat(beforeAdd[i]);
			}
			afterAdd[afterAdd.length - 1] = "라고 답변하였지.";
			return afterAdd;
		}
	}
}