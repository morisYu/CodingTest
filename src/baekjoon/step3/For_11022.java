package baekjoon.step3;

// A+B - 8
// A+B 를 바로 위 문제보다 아름답게 출력하는 문제

import java.util.Scanner;

public class For_11022 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
		}
	}
}
