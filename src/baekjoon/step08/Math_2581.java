package baekjoon.step09;

// 소수
// 2부터 x-1까지 모두 나눠서 x가 소수인지 판별하는 문제2

import java.util.Scanner;
import java.util.Arrays;

public class Math_2581 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		primeNumber(M,N);

//		testMath_2581.testCase();

	}

	static void primeNumber(int M, int N) {
		int sum = 0;
		int[] array = new int[N - M + 1];

		con: for (int i = M; i <= N; i++) {
			if (i == 1) {
				continue con;
			}
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					continue con;
				}
			}
			array[i - M] = i;
			sum += i;
		}
		
		if(sum==0) {
			System.out.println(-1);
			return;
		}
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
		System.out.println(sum);
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.println(array[i]);
				return;
			}
		}

	}
}

class testMath_2581 {
	static void testCase() {
		int M = (int) (Math.random() * 50 + 2);
		int N = (int) (Math.random() * 20 + M);

		System.out.println("입력값: M - " + M + " N - " + N);

		Math_2581.primeNumber(M, N);

	}
}
