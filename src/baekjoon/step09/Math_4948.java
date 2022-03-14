package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 베르트랑 공준
// 소수 응용 문제1.
// 임의의 자연수 n 에 대하여 n 보다 크고, 2n 보다 작거나 같은 소수는 적어도 하나 존재

public class Math_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {

			String str = br.readLine();
			int n = Integer.parseInt(str);
			int m = 2 * n;

			if (n == 0) {
				break;
			}

			sb.append(eratosthenes(n, m)).append("\n");
		}
		System.out.println(sb);

//		testMath_4948.testCase();

	}

	public static int eratosthenes(int n, int m) {

		int[] eraArray = new int[m + 1];
		boolean[] isPrime = new boolean[m + 1];
		int count = 0;

		for (int i = 0; i < eraArray.length; i++) {
			if (i <= 1) {
				isPrime[i] = false;
			} else {
				isPrime[i] = true;
			}
			eraArray[i] = i;
		}

		// 소수찾기2
		// 2의 배수는 모두제거, 3의 배수는 모두 제거, 4의 배수(2의 배수여서 이미 제거됨), 순서로 입력값 까지 모든 배수를 제거하면 소수만
		// 남음
		con: for (int i = 2; i <= (int) Math.sqrt(m); i++) {
			for (int j = 2; j < m; j++) {
				if (!isPrime[i]) {
					continue con;
				} else {
					if (i * j <= m) {
						isPrime[i * j] = false;
					} else {
						continue con;
					}
				}
			}
		}

		for (int i = n + 1; i <= m; i++) {
			if (isPrime[i]) {
				count++;
//				System.out.println(eraArray[i]);
			}
		}
//		System.out.println("n보다 크고 2n보다 작거나 같은 소수의 개수: " + count);
		return count;
	}
}

// 테스트 코드
class testMath_4948 {
	static void testCase() {
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int n = (int) (Math.random() * 50);
			int m = 2 * n;
			System.out.println("입력값: n = " + n + " , 2n = " + m);
			if (n == 0) {
				break;
			} else {
				sb.append(Math_4948.eratosthenes(n, m)).append("\n");
			}
		}
	}
}
