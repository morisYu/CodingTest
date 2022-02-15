package baekjoon.step6;

// 한수
// x가 한수인지 판별하는 함수를 정의하여 문제를 해결해 봅시다.

import java.util.Scanner;

public class Function_1065 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		System.out.println(han(N));
	}

	static int han(int x) {
		int result = 0;

		if (x < 100) {
			result = x;
		} else if (x >= 100 && x < 1000) {
			result = 99;

			for (int i = 100; i <= x; i++) {
				String str = Integer.toString(i);
				char[] ch = str.toCharArray();
				int[] array = new int[ch.length];

				for (int j = 0; j < ch.length; j++) {
					array[j] = Character.getNumericValue(ch[j]);
				}

				for (int k = 2; k < array.length; k++) {
					if ((array[k] - array[k - 1]) == (array[k - 1] - array[k - 2])) {
						result++;
						System.out.println(i);
					}
				}
			}
		} else if (x >= 1000 && x < 10000) {
			result = 99;

			for (int i = 100; i <= 999; i++) {
				String str = Integer.toString(i);
				char[] ch = str.toCharArray();
				int[] array = new int[ch.length];

				for (int j = 0; j < ch.length; j++) {
					array[j] = Character.getNumericValue(ch[j]);
				}

				for (int k = 2; k < array.length; k++) {
					if ((array[k] - array[k - 1]) == (array[k - 1] - array[k - 2])) {
						result++;
						System.out.println(i);
					}
				}
			}

			for (int i = 1000; i <= x; i++) {
				String str = Integer.toString(i);
				char[] ch = str.toCharArray();
				int[] array = new int[ch.length];

				for (int j = 0; j < ch.length; j++) {
					array[j] = Character.getNumericValue(ch[j]);
				}

				for (int k = 3; k < array.length; k++) {
					if ((array[k] - array[k - 1]) == (array[k - 1] - array[k - 2])
							&& (array[k - 1] - array[k - 2]) == (array[k - 2] - array[k - 3])) {
						result++;
						System.out.println(i);
					}
				}
			}
		}
		return result;
	}
}
