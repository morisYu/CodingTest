package baekjoon.step11;

// 분해합
// 모든 경우를 시도하여  N의 생성자를 구하는 문제
// 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합.

import java.util.Scanner;

public class BruteForce_2231 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();

		result(M);
		
//		TsetBruteForce_2231.testCase();
	}
	
	// 1 부터 M 이전까지 분해합을 전부 구해서 M 과 같은지 확인
	// N의 분해합이 M과 같으면 N은 M의 생성자
	static void result(int M) {
		for (int i = 1; i < M; i++) {
			if (disassemble(i) == M) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	static int disassemble(int i) {
		String N = Integer.toString(i);
		String[] str = N.split("");
		int[] nArray = new int[N.length()];
		int tmp = 0;
		int sum = 0;

		for (int k = 0; k < str.length; k++) {
			nArray[k] = Integer.parseInt(str[k]);
			tmp += nArray[k];
		}

		sum = Integer.parseInt(N) + tmp;
		return sum;
	}
}

class TsetBruteForce_2231 {
	static void testCase() {
		int N = (int) (Math.random() * 1000) + 1;
		System.out.println("입력값: "+N);
		BruteForce_2231.result(N);
	}
}
