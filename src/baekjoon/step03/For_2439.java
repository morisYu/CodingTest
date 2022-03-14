package baekjoon.step03;

// º° Âï±â - 2
// º°À» Âï´Â ¹®Á¦ 2

import java.util.Scanner;

public class For_2439 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= (N - i); j++) {
				System.out.print(" ");
			}
			for (int k = (N - i + 1); k <= N; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
