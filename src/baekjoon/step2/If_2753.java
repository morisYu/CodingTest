package baekjoon.step2;

// ����
// ������ �Ǻ��ϴ� ����

import java.util.Scanner;

public class If_2753 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();

		if (A % 4 == 0 && A % 100 != 0) {
			System.out.println(1);
		} else if (A % 4 == 0 && A % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
