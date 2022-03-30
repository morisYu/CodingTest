package baekjoon.step04;

// 나머지
// 숫자 10 개를 각각 42로 나눈 나머지 중 서로 다른 값이 몇 개 있는지 출력하는 문제

import java.util.Scanner;

public class Array_3052 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[10];
		int count = A.length;
		int[] result = new int[10];

		for (int i = 0; i < 10; i++) {
			A[i] = scanner.nextInt();
			result[i] = A[i] % 42;
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(result[i]);
		}
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (result[i] == result[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
