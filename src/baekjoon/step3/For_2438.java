package baekjoon.step3;

// º° Âï±â - 1
// º°À» Âï´Â ¹®Á¦

import java.util.Scanner;

public class For_2438 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
