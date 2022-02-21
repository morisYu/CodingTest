package baekjoon.step8;

// 분수찾기
// 분수의 순서에서 규칙은 찾는 문제

import java.util.Scanner;

public class Math_1193 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		System.out.println(fractionalNo(x));
	}

	static int fractionalNo(int x) {
		int result = 0;
		int count = 0;
		int sum = 0;
		
		while(true) {
			count++;
			
		}
		
		
		
		
		
		int[] m = new int[x];
		int[] n = new int[x];
		String[] mStr = new String[x];
		String[] nStr = new String[x];
		for (int k = 1; k <= x; k++) {
			for (int i = 0; i < k; i++) {
				n[i] = i + 1;
				m[x - i - 1] = i + 1;
				count++;
				nStr[i] = Integer.toString(n[i]);
				mStr[x - i - 1] = Integer.toString(m[x - i - 1]);
				System.out.println("count : " + count);
			}
			for (int i = 0; i < x; i++) {
				System.out.println(nStr[i] + "/" + mStr[i]);
			}
		}
		return result;
	}
}

// 테스트 코드
class testMath_1193 {

	private int x = (int) (Math.random() * 10 + 1);

	void testCase() {
		Math_1193.fractionalNo(x);
	}
}
