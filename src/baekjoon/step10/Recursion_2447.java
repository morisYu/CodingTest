package baekjoon.step10;

// 별 찍기-10
// 재귀적인 패턴을 재귀함수로 찍는 문제1
// 재귀함수 공부 더 필요함.

import java.util.Scanner;

public class Recursion_2447 {
	
	public static char[][] ch;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = (int) Math.pow(3, k);
		ch = new char[n][n];
		star(k);
	}

	static void star(int k) {
		StringBuilder sb = new StringBuilder();
		int n = (int) Math.pow(3, k);
		int x = k / 3;
		int y = k / 3;

		if (k == 1) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == 1 && j == 1) {
						ch[i][j] = ' ';
					} else {
						ch[i][j] = '*';
					}
				}
			}
		} else {

			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					if (i == x && j == y) {
						for (int m = x; m < x + (n / 3); m++) {
							for (int l = y; l < y + (n / 3); l++) {
								ch[m][l] = ' ';
							}
						}
						x *= 3;
						y *= 3;
					} else {
						star(k - 1);
					}
				}
			}
		}

		// 출력부분
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(ch[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class testRecurtion_2447 {
	static void testCase() {
		int k = (int) (Math.random() * 8);

		System.out.println("입력값: " + k);
	}
}
