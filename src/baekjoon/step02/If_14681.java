package baekjoon.step02;

// 사분면 고르기
// 점이 어느 사분면에 있는지 알아내는 문제

import java.util.Scanner;

public class If_14681 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		} else if (x < 0 && y < 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

	}
}
