package baekjoon.step8;

// 벌집
// 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제

import java.util.Scanner;

public class Math_2292 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		System.out.println(beeHive(N));

	}
	
	// 1 주변으로 한 바퀴 증가할 때 마다 반경이 1 씩 올라감.
	// 한 바퀴마다 최소값과 최대값을 구하고 해당 범위 내에 있으면 해당 그 반경 안에 있는 것으로 판단하여 이둥 수 계산
	static int beeHive(int N) {
		int result = 0;
		int count = 0;
		int min = 2;
		int max;

		if (N == 1) {
			result = 1;
			return result;
		} else {
			while (true) {
				min = min + 6 * count;
				max = min + (6 * (count + 1)) - 1;
				if (N >= min && N <= max) {
					result = count + 2;
					break;
				} else {
					count++;
				}
			}
			return result;
		}
	}
}

// 테스트 코드
class testMath_2292 {
	private int N = (int) (Math.random() * 70 + 1);

	void testCase() {
		System.out.println("입력값 :" + N);
		System.out.println("결과값 : " + Math_2292.beeHive(N));
	}

}
