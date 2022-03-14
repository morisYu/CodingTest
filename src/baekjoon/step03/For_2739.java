package baekjoon.step03;

// 구구단
// 구구단을 출력하는 문제

import java.util.Scanner;

public class For_2739 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + (N * i));
		}
	}
}
