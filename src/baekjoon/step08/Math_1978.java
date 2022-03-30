package baekjoon.step08;

// 소수 찾기
// 2부터 x-1까지 모두 나눠서 x가 소수인지 판별하는 문제1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		String str = br.readLine();
		st = new StringTokenizer(str);
		int[] x = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(st.nextToken());
//			System.out.print(x[i] + " ");
		}

		System.out.println(primeNumber(x));
	}

	static int primeNumber(int[] x) {
		int result = 0;

		con: for (int i = 0; i < x.length; i++) {
			if (x[i] == 1) {
//				System.out.println("1 은 소수가 아님");
				continue con;
			}
			for (int j = 2; j < x[i] - 1; j++) {
				if (x[i] % j == 0) {
//					System.out.println(x[i] + " 는 소수가 아님");
					continue con;
				}
			}
			result++;
		}
		return result;
	}
}

class testMath_1978 {
	static void testCase() {
		int N = (int) (Math.random() * 20 + 2);
		int[] x = new int[N];

		System.out.println("입력값: N - " + N);
		System.out.print("입력값: ");

		for (int i = 0; i < N; i++) {
			x[i] = (int) (Math.random() * 100 + 1);
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("결과값: " + Math_1978.primeNumber(x));
	}
}
