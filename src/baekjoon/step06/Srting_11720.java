package baekjoon.step06;

// 정수의 합
// 정수를 문자열로 입력받는 문제.

import java.util.Scanner;

public class Srting_11720 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] number = new int[N];
		String str = scanner.next();
		char[] ch = str.toCharArray();
		int sum = 0;

		for (int i = 0; i < N; i++) {
			number[i] = ch[i] - '0';
			sum += number[i];
		}
		System.out.println(sum);
	}
}
