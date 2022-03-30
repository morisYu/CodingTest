package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int n;

		for (int i = 0; i < T; i++) {
			n = Integer.parseInt(br.readLine());
			sb.append(goldbach(n)).append("\n");
		}
		System.out.println(sb);

//		testMath_9020.testCase();

	}

	static String goldbach(int n) {
		String result = null;
		int[] primeArray = new int[n + 1];
		for (int i = 0; i < primeArray.length; i++) {
			if (i <= 1) {
				primeArray[i] = 0;
			} else {
				primeArray[i] = i;
			}
		}

		// 에라토스테네스의 체
		// 일반 소수는 나머지 연산 후 값을 비교해서 소수인지 판별하고, 에라토스테네스는 나머지 연산 없이 배열 인덱스에 값을 바로 대입
		// for 문을 실행하면서 값을 바로 대입하는 것이 연산 후 판별해서 값을 대입하는것보다 시간차이가 약 3배 이상 빠름
		con: for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			for (int j = 2; j < n; j++) {
				if (primeArray[i] == 0) {
					continue con;
				} else {
					if (i * j <= n) {
						primeArray[i * j] = 0;
					} else {
						continue con;
					}
				}
			}
		}

		// 일반 소수
//		for (int i = 3; i <= n; i++) {
//			for (int j = 2; j < i; j++) {
//
//				if (primeArray[i] % j == 0) {
//					primeArray[i] = 0;
//					break;
//				}
//			}
//		}

//		for (int i = 0; i < primeArray.length; i++) {
//			if (primeArray[i] != 0) {
//				System.out.println(primeArray[i]);
//			}
//		}

//		System.out.println("결과");
//		System.out.println("length/2 = " + primeArray.length / 2);
		for (int i = n / 2; i >= 2; i--) {
			for (int j = n / 2; j <= n; j++) {
//				System.out.println(primeArray[i] + " , " + primeArray[j]);
				if (primeArray[i] + primeArray[j] == n) {
					result = Integer.toString(primeArray[i]) + " " + Integer.toString(primeArray[j]);
					return result;
				}
			}
		}
		return result;
	}
}

// 테스트 코드
class testMath_9020 {
	static void testCase() {
		int T = (int) (Math.random() * 5) + 1;

		for (int i = 0; i < T; i++) {
			int n = 2 * ((int) (Math.random() * 200)) + 4;
			System.out.println("입력값: " + n);
			Math_9020.goldbach(n);
			System.out.println();
		}
	}
}
