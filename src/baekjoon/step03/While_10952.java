package baekjoon.step03;

// A+B-5
// 0 0 �� ���� ������ A+B �� ����ϴ� ����

import java.util.Scanner;

public class While_10952 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();

			if (A == 0 && B == 0) {
				break;
			} else {
				System.out.println(A + B);
			}
		}
	}
}
