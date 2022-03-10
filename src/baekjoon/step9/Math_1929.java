package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소수 구하기
// 에라토스테네스의 체로 풀어봅시다.
// 많은 숫자의 소수 판별은 에라토스테네스의 체로 푸는 것이 시간이 훨씬 빠름

public class Math_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] strArray = str.split(" ");
		int m = Integer.parseInt(strArray[0]);
		int n = Integer.parseInt(strArray[1]);

		eratosthenes(m, n);

//		testMath_1929.testCase();

	}

	public static void eratosthenes(int m, int n) {

		int[] eraArray = new int[n + 1];
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 0; i < eraArray.length; i++) {
			if (i <= 1) {
				isPrime[i] = false;
			} else {
				isPrime[i] = true;
			}
			eraArray[i] = i;
		}

		// 소수찾기2
		// 2의 배수는 모두제거, 3의 배수는 모두 제거, 4의 배수(2의 배수여서 이미 제거됨), 순서로 입력값 까지 모든 배수를 제거하면 소수만 남음
		con: for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			for (int j = 2; j < n; j++) {
				if (!isPrime[i]) {
					continue con;
				} else {
					if (i * j <= n) {
							isPrime[i * j] = false;
					} else {
						continue con;
					}
				}
			}
		}

		// 소수찾기1
		// 입력값을 숫자 2부터 n까지를 나누어서 나머지가 있으면 소수가 아닌 것으로 판별
//		for (int i = 2; i < n; i++) {
//			for (int j = 2; j <= n; j++) {
//				if (isPrime[j] == false) {
//					continue;
//				} else {
//					if (i != j) {
//						if (j % i == 0) {
//							isPrime[j] = false;
//						}
//					}
//				}
//			}
//		}

//		for (int i = 0; i < eraArray.length; i++) {
//			System.out.println(eraArray[i] + " = " + isPrime[i]);
//		}

//		int count = 0;
//		System.out.println("결과");
		for (int i = m; i <= n; i++) {
			if (isPrime[i]) {
//				count++;
				System.out.println(eraArray[i]);
			}
		}
//		System.out.println("m에서n까지 소수의 개수: " + count);

	}
}

// 테스트 코드
class testMath_1929 {
	static void testCase() {
		int m;
		int n;

		while (true) {
			m = (int) (Math.random() * 50) + 1;
			n = (int) (Math.random() * 50) + 1;
			if (n < m) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("입력값: m = " + m + " , n = " + n);
		Math_1929.eratosthenes(m, n);
	}
}
