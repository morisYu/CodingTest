package baekjoon.step2;

// �� �� ���ϱ�
// �� ���� ���� ����� ����ϴ� ����

import java.util.Scanner;

public class If_1330 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		String str = (A > B) ? ">" : (A < B) ? "<" : "==";
		System.out.println(str);

	}
}
