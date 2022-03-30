package baekjoon.step08;

// 손익분기점
// 이익이 발생하는 지점을 찾는 문제

import java.util.Scanner;

public class Math_1712 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		System.out.println(breakEven(A, B, C));

	}

	static int breakEven(int A, int B, int C) {
		int result = -1;

		if (B >= C) {
			return result;
		} else {
			
			result = (A/(C-B))+1;
			// while 문으로 n 값을 증가하면 시간이 오래 걸림(시간초과)
//			int n = 0;
//			do {
//				n++;
//				if ((A / (C - B)) < n) {
//					result = n;
//					break;
//				}
//			} while (true);
		}
		return result;
	}
}

// 테스트 코드
class testMath_1712 {
	private int A = (int) (Math.random() * 2100000000);
	private int B = (int) (Math.random() * 2100000000);
	private int C = (int) (Math.random() * 2100000000);

	void testCase() {

		System.out.println("A 입력값: " + A);
		System.out.println("B 입력값: " + B);
		System.out.println("C 입력값: " + C);
		System.out.println("손익분기점: " + Math_1712.breakEven(A, B, C));
	}
}
