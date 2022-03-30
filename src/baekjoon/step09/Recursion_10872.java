package baekjoon.step09;

// 팩토리얼
// 팩토리얼은 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.

import java.util.Scanner;

public class Recursion_10872 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(factorial(n));
		
		testRecursion_10872.testCase();
	}

	// 재귀함수는 자기 자신을 호출하는 함수
	// for 문 보다 실행속도는 느리지만 가독성이 좋음, 변수 사용을 줄일 수 있음 
	static int factorial(int n) {
		int result;
		if (n == 0) {
			result = 1;
		} else if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		}

		return result;
	}
}

// 테스트 코드
class testRecursion_10872 {
	static void testCase() {
		int n = (int) (Math.random() * 12);
		int result = 1;
		System.out.println("입력값: "+n);
		
		double t1 = System.nanoTime();
		Recursion_10872.factorial(n);
		double t2 = System.nanoTime();
		System.out.println("재귀 시간: " + (t2 - t1));
		System.out.println("결과: "+Recursion_10872.factorial(n));

		double t3 = System.nanoTime();
		if (n == 0 || n==1) {
			Recursion_10872.factorial(n);
		}else {
			for(int i=1;i<=n;i++) {
				result*=i;
			}
		}
		double t4 = System.nanoTime();
		System.out.println("for문 시간: " + (t4 - t3));
		System.out.println("결과: "+result);

	}
}
