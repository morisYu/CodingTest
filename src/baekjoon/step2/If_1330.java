package baekjoon.step2;

// 두 수 비교하기
// 두 수를 비교한 결과를 출력하는 문제

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
