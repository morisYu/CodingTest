package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// �Ҽ� ���ϱ�
// �����佺�׳׽��� ü�� Ǯ��ô�.
// ���� ������ �Ҽ� �Ǻ��� �����佺�׳׽��� ü�� Ǫ�� ���� �ð��� �ξ� ����

public class Math_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] strArray = str.split(" ");
		int m = Integer.parseInt(strArray[0]);
		int n = Integer.parseInt(strArray[1]);

		eratosthenes(m, n);

//		testMath_1929.testCase();

	}

	public static void eratosthenes(int m, int n) {

		int[] eraArray = new int[n + 1];
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 0; i < eraArray.length; i++) {
			if (i <= 1) {
				isPrime[i] = false;
			} else {
				isPrime[i] = true;
			}
			eraArray[i] = i;
		}

		// �Ҽ�ã��2
		// 2�� ����� �������, 3�� ����� ��� ����, 4�� ���(2�� ������� �̹� ���ŵ�), ������ �Է°� ���� ��� ����� �����ϸ� �Ҽ��� ����
		con: for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			for (int j = 2; j < n; j++) {
				if (!isPrime[i]) {
					continue con;
				} else {
					if (i * j <= n) {
							isPrime[i * j] = false;
					} else {
						continue con;
					}
				}
			}
		}

		// �Ҽ�ã��1
		// �Է°��� ���� 2���� n������ ����� �������� ������ �Ҽ��� �ƴ� ������ �Ǻ�
//		for (int i = 2; i < n; i++) {
//			for (int j = 2; j <= n; j++) {
//				if (isPrime[j] == false) {
//					continue;
//				} else {
//					if (i != j) {
//						if (j % i == 0) {
//							isPrime[j] = false;
//						}
//					}
//				}
//			}
//		}

//		for (int i = 0; i < eraArray.length; i++) {
//			System.out.println(eraArray[i] + " = " + isPrime[i]);
//		}

//		int count = 0;
//		System.out.println("���");
		for (int i = m; i <= n; i++) {
			if (isPrime[i]) {
//				count++;
				System.out.println(eraArray[i]);
			}
		}
//		System.out.println("m����n���� �Ҽ��� ����: " + count);

	}
}

// �׽�Ʈ �ڵ�
class testMath_1929 {
	static void testCase() {
		int m;
		int n;

		while (true) {
			m = (int) (Math.random() * 50) + 1;
			n = (int) (Math.random() * 50) + 1;
			if (n < m) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("�Է°�: m = " + m + " , n = " + n);
		Math_1929.eratosthenes(m, n);
	}
}
