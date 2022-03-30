package baekjoon.step08;

// 부녀회장이 될테야
// 층과 거주자 수의 규칙을 찾는 문제

import java.util.Scanner;

public class Math_2775 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {

			int k = scanner.nextInt();
			int n = scanner.nextInt();
			System.out.println(dweller(k, n));

		}

//		testMath_2775.testCase();
	}

	static int dweller(int k, int n) {
		int result = 0;

		int[][] floor = new int[k + 1][n];

		for (int i = 0; i < n; i++) {
			floor[0][i] = i + 1;
			System.out.println("floor[0][" + i + "] = " + floor[0][i]);
		}
		for (int i = 1; i < (k + 1); i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += floor[i - 1][j];
				floor[i][j] = sum;
				System.out.println(i + " 층 " + (j + 1) + " 호: " + floor[i][j]);
			}
		}

		result = floor[k][n - 1];
		return result;
	}
}

// 테스트코드
class testMath_2775 {
	static void testCase() {
		int k = (int) (Math.random() * 5 + 1);
		int n = (int) (Math.random() * 5 + 1);
		System.out.println("입력값: k= " + k + " n= " + n);
		System.out.println("결과값: " + Math_2775.dweller(k, n));
	}
}
