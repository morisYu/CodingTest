package baekjoon.step3;

// ��
// 1���� N������ ���� ���ϴ� ����.

import java.util.Scanner;

public class For_8393 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
