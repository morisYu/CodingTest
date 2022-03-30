package baekjoon.step07;

// 문자열 반복
// 각 문자를 반복하여 출력하는 문제

import java.util.Scanner;

public class String_2675 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int R = scanner.nextInt();
			String S = scanner.next();
			char[] ch = S.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		}
	}
}
