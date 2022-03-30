package baekjoon.step04;

// 최소, 최대
// 최솟값과 최댓값을 찾는 문제

import java.util.Scanner;

public class Array_10818 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}

		int max = array[0];
		int min = array[0];

		for (int i = 0; i < N; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min + " " + max);

	}
}
