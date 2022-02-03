package baekjoon.step3;

// 기찍N
// N부터 1까지 출력하는 문제

import java.util.Scanner;

public class For_2742 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = N; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
