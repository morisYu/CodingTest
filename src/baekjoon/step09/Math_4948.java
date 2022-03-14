package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ����Ʈ�� ����
// �Ҽ� ���� ����1.
// ������ �ڿ��� n �� ���Ͽ� n ���� ũ��, 2n ���� �۰ų� ���� �Ҽ��� ��� �ϳ� ����

public class Math_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {

			String str = br.readLine();
			int n = Integer.parseInt(str);
			int m = 2 * n;

			if (n == 0) {
				break;
			}

			sb.append(eratosthenes(n, m)).append("\n");
		}
		System.out.println(sb);

//		testMath_4948.testCase();

	}

	public static int eratosthenes(int n, int m) {

		int[] eraArray = new int[m + 1];
		boolean[] isPrime = new boolean[m + 1];
		int count = 0;

		for (int i = 0; i < eraArray.length; i++) {
			if (i <= 1) {
				isPrime[i] = false;
			} else {
				isPrime[i] = true;
			}
			eraArray[i] = i;
		}

		// �Ҽ�ã��2
		// 2�� ����� �������, 3�� ����� ��� ����, 4�� ���(2�� ������� �̹� ���ŵ�), ������ �Է°� ���� ��� ����� �����ϸ� �Ҽ���
		// ����
		con: for (int i = 2; i <= (int) Math.sqrt(m); i++) {
			for (int j = 2; j < m; j++) {
				if (!isPrime[i]) {
					continue con;
				} else {
					if (i * j <= m) {
						isPrime[i * j] = false;
					} else {
						continue con;
					}
				}
			}
		}

		for (int i = n + 1; i <= m; i++) {
			if (isPrime[i]) {
				count++;
//				System.out.println(eraArray[i]);
			}
		}
//		System.out.println("n���� ũ�� 2n���� �۰ų� ���� �Ҽ��� ����: " + count);
		return count;
	}
}

// �׽�Ʈ �ڵ�
class testMath_4948 {
	static void testCase() {
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int n = (int) (Math.random() * 50);
			int m = 2 * n;
			System.out.println("�Է°�: n = " + n + " , 2n = " + m);
			if (n == 0) {
				break;
			} else {
				sb.append(Math_4948.eratosthenes(n, m)).append("\n");
			}
		}
	}
}
