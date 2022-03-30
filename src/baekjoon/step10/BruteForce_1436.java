package baekjoon.step10;

// ��ȭ���� ��
// N��° ������ ���� ���� ������ ���ʴ�� �õ��ϴ� ����

import java.util.Scanner;

public class BruteForce_1436 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		System.out.println(endNumber(N));
		
//		testBruteForce_1436.testCase();

	}

	static int endNumber(int N) {
		int count = 0;
		int result = 0;
		String str;

		for (int i = 666; i < Integer.MAX_VALUE; i++) {
			str = Integer.toString(i);
			if (str.contains("666")) {
				count++;
			}
			if (N == count) {
				result = i;
				break;
			}
		}

		return result;
	}
}

// �׽�Ʈ�ڵ�
class testBruteForce_1436{
	static void testCase() {
		int N = (int)(Math.random()*10000)+1;
		System.out.println("�Է°�: "+ N);
		System.out.println();
		System.out.println("�����: "+ BruteForce_1436.endNumber(N));
	}
}
