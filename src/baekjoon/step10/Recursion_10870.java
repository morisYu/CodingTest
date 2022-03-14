package baekjoon.step10;

// 피보나치 수 5
// 피보나치 수 역시 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.

import java.util.Scanner;

public class Recursion_10870 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(fibonacci(n));
		
	}
	
	static int fibonacci(int n) {
		int result=0;
		if(n==0) {
			result = 0;
		}else if(n==1) {
			result = 1;
		}else {
			result = fibonacci(n-1)+fibonacci(n-2);
		}
		return result;
	}
}

// 테스트코드
class testRecursion_10870{
	static void testCase() {
		int n = (int)(Math.random()*20);
		System.out.println("입력값: "+n);
		double t1 = System.nanoTime();
		System.out.println("결과값: "+Recursion_10870.fibonacci(n));
		double t2 = System.nanoTime();
		System.out.println("경과시간: "+(t2-t1));
	
	}
}
