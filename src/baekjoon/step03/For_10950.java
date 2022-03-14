package baekjoon.step03;

//A+B - 3
//A+B 를 여러 번 출력하는 문제

import java.util.Scanner;

public class For_10950 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A + B);
		}
	}
}
