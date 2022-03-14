package baekjoon.step08;

// ���ͺб���
// ������ �߻��ϴ� ������ ã�� ����

import java.util.Scanner;

public class Math_1712 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		System.out.println(breakEven(A, B, C));

	}

	static int breakEven(int A, int B, int C) {
		int result = -1;

		if (B >= C) {
			return result;
		} else {
			
			result = (A/(C-B))+1;
			// while ������ n ���� �����ϸ� �ð��� ���� �ɸ�(�ð��ʰ�)
//			int n = 0;
//			do {
//				n++;
//				if ((A / (C - B)) < n) {
//					result = n;
//					break;
//				}
//			} while (true);
		}
		return result;
	}
}

// �׽�Ʈ �ڵ�
class testMath_1712 {
	private int A = (int) (Math.random() * 2100000000);
	private int B = (int) (Math.random() * 2100000000);
	private int C = (int) (Math.random() * 2100000000);

	void testCase() {

		System.out.println("A �Է°�: " + A);
		System.out.println("B �Է°�: " + B);
		System.out.println("C �Է°�: " + C);
		System.out.println("���ͺб���: " + Math_1712.breakEven(A, B, C));
	}
}
