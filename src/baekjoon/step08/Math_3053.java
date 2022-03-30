package baekjoon.step09;

// 택시 기하학
// 유클리드 기하학과 택시 기하학에 대한 문제
// 유클리드 기하학과 택시 기하학에서의 원은 모양이 다름

import java.util.Scanner;

public class Math_3053 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int r = scanner.nextInt();
		System.out.printf("%.6f\n", euclidean(r));
		System.out.printf("%.6f", taxi(r));

//		testMath_3053.testCase();
	}

	static double euclidean(int r) {
		double area = 0.0;
		area = Math.PI * r * r;
		return area;
	}

	static double taxi(int r) {
		double area = 0.0;
		area = 4 * (r * r / 2.0);
		return area;
	}
}

class testMath_3053 {
	static void testCase() {
		int r = (int) (Math.random() * 100) + 1;

		System.out.println("입력값: " + r);
		System.out.printf("유클리드 원넓이: %.6f\n", Math_3053.euclidean(r));
		System.out.printf("택시 원넓이: %.6f", Math_3053.taxi(r));
	}
}
