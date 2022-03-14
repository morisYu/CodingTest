package baekjoon.step10;

// �� ���-10
// ������� ������ ����Լ��� ��� ����1
// ����Լ� ���� �� �ʿ���.

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

		// ��ºκ�
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
