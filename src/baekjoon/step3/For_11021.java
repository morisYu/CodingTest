package baekjoon.step3;

// A+B - 7
// A+B 를 조금 더 아름답게 출력하는 문제

import java.util.Scanner;

public class For_11021 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println("Case #" + i + ": " + (A + B));
		}
	}
}
