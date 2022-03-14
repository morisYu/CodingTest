package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int n;

		for (int i = 0; i < T; i++) {
			n = Integer.parseInt(br.readLine());
			sb.append(goldbach(n)).append("\n");
		}
		System.out.println(sb);

//		testMath_9020.testCase();

	}

	static String goldbach(int n) {
		String result = null;
		int[] primeArray = new int[n + 1];
		for (int i = 0; i < primeArray.length; i++) {
			if (i <= 1) {
				primeArray[i] = 0;
			} else {
				primeArray[i] = i;
			}
		}

		// �����佺�׳׽��� ü
		// �Ϲ� �Ҽ��� ������ ���� �� ���� ���ؼ� �Ҽ����� �Ǻ��ϰ�, �����佺�׳׽��� ������ ���� ���� �迭 �ε����� ���� �ٷ� ����
		// for ���� �����ϸ鼭 ���� �ٷ� �����ϴ� ���� ���� �� �Ǻ��ؼ� ���� �����ϴ°ͺ��� �ð����̰� �� 3�� �̻� ����
		con: for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			for (int j = 2; j < n; j++) {
				if (primeArray[i] == 0) {
					continue con;
				} else {
					if (i * j <= n) {
						primeArray[i * j] = 0;
					} else {
						continue con;
					}
				}
			}
		}

		// �Ϲ� �Ҽ�
//		for (int i = 3; i <= n; i++) {
//			for (int j = 2; j < i; j++) {
//
//				if (primeArray[i] % j == 0) {
//					primeArray[i] = 0;
//					break;
//				}
//			}
//		}

//		for (int i = 0; i < primeArray.length; i++) {
//			if (primeArray[i] != 0) {
//				System.out.println(primeArray[i]);
//			}
//		}

//		System.out.println("���");
//		System.out.println("length/2 = " + primeArray.length / 2);
		for (int i = n / 2; i >= 2; i--) {
			for (int j = n / 2; j <= n; j++) {
//				System.out.println(primeArray[i] + " , " + primeArray[j]);
				if (primeArray[i] + primeArray[j] == n) {
					result = Integer.toString(primeArray[i]) + " " + Integer.toString(primeArray[j]);
					return result;
				}
			}
		}
		return result;
	}
}

// �׽�Ʈ �ڵ�
class testMath_9020 {
	static void testCase() {
		int T = (int) (Math.random() * 5) + 1;

		for (int i = 0; i < T; i++) {
			int n = 2 * ((int) (Math.random() * 200)) + 4;
			System.out.println("�Է°�: " + n);
			Math_9020.goldbach(n);
			System.out.println();
		}
	}
}
