package baekjoon.step05;

// OX 퀴즈
// OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제

import java.util.Scanner;

public class Array_8958 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] str = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = scanner.next();
			char[] ch = str[i].toCharArray();
			int[] score = new int[ch.length];

			if (ch[0] == 'O') {
				score[0]++;
			}
			for (int j = 1; j < ch.length; j++) {
				if (ch[j] == 'O') {
					score[j]++;
					if (ch[j] == ch[j - 1]) {
						score[j]+=score[j-1];
					}
				}
			}
			int sum = 0;
			for (int k = 0; k < score.length; k++) {
//				System.out.println(score[k]);
				sum += score[k];
			}
			System.out.println(sum);
		}

	}
}
