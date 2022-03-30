package baekjoon.step04;

// ����� �Ѱ���
// ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ���

import java.util.Scanner;

public class Array_4344 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int C = scanner.nextInt();

		for (int i = 0; i < C; i++) {
			int N = scanner.nextInt();
			int[] score = new int[N];
			for (int j = 0; j < N; j++) {
				score[j] = scanner.nextInt();
			}
			double avg = average(score);
			int count = 0;
			for (int k = 0; k < N; k++) {
				if (score[k] > avg) {
					count++;
				}
			}
			avgPerson(count, N);
		}

	}

	static double average(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		double avg = (double) sum / score.length;
		return avg;
	}

	static void avgPerson(int count, int N) {

		double avg = (double) count / N*100;
		System.out.println(String.format("%.3f", avg) + "%");

	}
}
