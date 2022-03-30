package baekjoon.step08;

// 분수찾기
// 분수의 순서에서 규칙은 찾는 문제

import java.util.Scanner;

public class Math_1193 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		fractionalNo(x);

		// 테스트 부분

//		testMath_1193 test = new testMath_1193();
//		test.testCase();

	}

	// 분수를 위/아래 숫자 조합으로 생각하고 각 배열의 시작점을 찾음(1/1, 1/2, 1/3, ...)
	// 입력한 값이 시작점에서 얼만큼 떨어져 있는지 계산해서 위/아래 숫자를 1씩 증감해줌
	// 지그재그로 순번이 매겨져서 헷갈림
	static void fractionalNo(int x) {
		int count = 1;
		int m = 0;
		int n = 0;

		while (true) {
			int sum = 1;
			for (int i = 0; i < count; i++) {
				sum += i;
			}
//			System.out.println("sum: "+sum);
			if ((x - sum) < count) {
				if (count % 2 == 0) {
					m = count;
					n = 1;
//					System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					for (int j = 1; j < (x - sum) + 1; j++) {
						m--;
						n++;
//						System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					}
					break;
				} else {
					n = count;
					m = 1;
//					System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					for (int j = 1; j < (x - sum) + 1; j++) {
						n--;
						m++;
//						System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					}
					break;
				}

			} else {
				count++;
			}
		}
		System.out.println(n + "/" + m);
	}
}

// 테스트 코드
class testMath_1193 {

	private int x = (int) (Math.random() * 20 + 1);

	void testCase() {
		double startTime = System.currentTimeMillis();

		System.out.println("입력값: " + x);
		Math_1193.fractionalNo(x);

		double endTime = System.currentTimeMillis();
		double testTime = (endTime - startTime) / 1000;
		System.out.println("테스트시간: " + testTime + " 초");
	}
}
