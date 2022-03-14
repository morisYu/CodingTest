package baekjoon.step08;

// ���� ���
// 5�� 3�� �ּ� Ƚ���� ���Ͽ� N�� ����� ����

import java.util.Scanner;

public class Math_2839 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		System.out.println(sugar(N));

//		testMath_2893.testCase();
	}

	// 5���� ����� �������� 3 ���� ������������� Ȯ��
	static int sugar(int N) {
		int result = -1;
		int count = 0;
		int tmp5 = 0;
		int tmp3 = 0;

		if (N % 5 == 0) {
//			System.out.println("5�� ��������");
			result = N / 5;
		} else {
			count = N / 5;
			for (int i = count; i >= 1; i--) {
//				System.out.println("count - " + i);
				tmp5 = N - (5 * i);
//				System.out.println("tmp5 - " + tmp5);
				tmp3 = tmp5 % 3;
//				System.out.println("tmp3 - " + tmp3);
				if (tmp3 == 0) {
//					System.out.println(i + " " + tmp5 + " " + (tmp5 / 3));
					result = i + (tmp5 / 3);
					return result;
				}
			}
			if (N % 3 == 0) {
//				System.out.println("3���� ��������");
				result = N / 3;
			}
		}
		return result;
	}
}

// �׽�Ʈ �ڵ�
class testMath_2893 {
	static void testCase() {
		int N = (int) (Math.random() * 50 + 1);

		System.out.println("�Է°�: " + N);
		System.out.println("��°�: " + Math_2839.sugar(N));

	}
}
