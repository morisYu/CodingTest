package baekjoon.step6;

// 정수 N 개의 합
// 함수를 구현해 봅시다.

public class Function_15596 {
	long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
