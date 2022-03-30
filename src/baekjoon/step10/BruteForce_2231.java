package baekjoon.step11;

// ������
// ��� ��츦 �õ��Ͽ�  N�� �����ڸ� ���ϴ� ����
// �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ��.

import java.util.Scanner;

public class BruteForce_2231 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();

		result(M);
		
//		TsetBruteForce_2231.testCase();
	}
	
	// 1 ���� M �������� �������� ���� ���ؼ� M �� ������ Ȯ��
	// N�� �������� M�� ������ N�� M�� ������
	static void result(int M) {
		for (int i = 1; i < M; i++) {
			if (disassemble(i) == M) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	static int disassemble(int i) {
		String N = Integer.toString(i);
		String[] str = N.split("");
		int[] nArray = new int[N.length()];
		int tmp = 0;
		int sum = 0;

		for (int k = 0; k < str.length; k++) {
			nArray[k] = Integer.parseInt(str[k]);
			tmp += nArray[k];
		}

		sum = Integer.parseInt(N) + tmp;
		return sum;
	}
}

class TsetBruteForce_2231 {
	static void testCase() {
		int N = (int) (Math.random() * 1000) + 1;
		System.out.println("�Է°�: "+N);
		BruteForce_2231.result(N);
	}
}
