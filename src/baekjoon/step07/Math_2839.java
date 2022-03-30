package baekjoon.step08;

// 설탕 배달
// 5와 3을 최소 횟수로 합하여 N을 만드는 문제

import java.util.Scanner;

public class Math_2839 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		System.out.println(sugar(N));

//		testMath_2893.testCase();
	}

	// 5부터 나누어서 나머지가 3 으로 나누어떨어지는지 확인
	static int sugar(int N) {
		int result = -1;
		int count = 0;
		int tmp5 = 0;
		int tmp3 = 0;

		if (N % 5 == 0) {
//			System.out.println("5로 나누어짐");
			result = N / 5;
		} else {
			count = N / 5;
			for (int i = count; i >= 1; i--) {
//				System.out.println("count - " + i);
				tmp5 = N - (5 * i);
//				System.out.println("tmp5 - " + tmp5);
				tmp3 = tmp5 % 3;
//				System.out.println("tmp3 - " + tmp3);
				if (tmp3 == 0) {
//					System.out.println(i + " " + tmp5 + " " + (tmp5 / 3));
					result = i + (tmp5 / 3);
					return result;
				}
			}
			if (N % 3 == 0) {
//				System.out.println("3으로 나누어짐");
				result = N / 3;
			}
		}
		return result;
	}
}

// 테스트 코드
class testMath_2893 {
	static void testCase() {
		int N = (int) (Math.random() * 50 + 1);

		System.out.println("입력값: " + N);
		System.out.println("출력값: " + Math_2839.sugar(N));

	}
}
