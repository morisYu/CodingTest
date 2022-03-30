package baekjoon.step05;

// 평균
// 평균을 조작하는 문제

import java.util.Scanner;

public class Array_1546 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] score = new int[N];

		for (int i = 0; i < N; i++) {
			score[i] = scanner.nextInt();
		}

		int M = score[0];
		for (int i = 1; i < N; i++) {
			if (M < score[i]) {
				M = score[i];
			}
		}
		System.out.println(M);

		float[] newScore = new float[N];
		for (int k = 0; k < N; k++) {
			newScore[k] = (float) score[k] / M * 100;
		}

		float sum = 0;
		for (int i = 0; i < N; i++) {
			sum += newScore[i];
		}

		float avg = sum / N;

		System.out.println(sum);
		System.out.println(avg);
	}
}
