package baekjoon.step10;

// 별 찍기-10
// 재귀적인 패턴을 재귀함수로 찍는 문제1
// 재귀함수 공부 더 필요함.

import java.util.Scanner;

public class Recursion_2447 {

	public static char[][] ch;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ch = new char[N][N];
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				ch[i][j] = ' ';
			}
		}
		star(0, 0, N);

		// 출력부분
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(ch[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void star(int x, int y, int N) {
		if (N == 1) {
			ch[x][y] = '*';
		} else {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (!(i == 1 && j == 1)) {
						star(x + i * (N / 3), y + j * (N / 3), N / 3);
					}
				}
			}
		}

	}
}
