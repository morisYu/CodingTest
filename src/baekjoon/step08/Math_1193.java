package baekjoon.step08;

// �м�ã��
// �м��� �������� ��Ģ�� ã�� ����

import java.util.Scanner;

public class Math_1193 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		fractionalNo(x);

		// �׽�Ʈ �κ�

//		testMath_1193 test = new testMath_1193();
//		test.testCase();

	}

	// �м��� ��/�Ʒ� ���� �������� �����ϰ� �� �迭�� �������� ã��(1/1, 1/2, 1/3, ...)
	// �Է��� ���� ���������� ��ŭ ������ �ִ��� ����ؼ� ��/�Ʒ� ���ڸ� 1�� ��������
	// ������׷� ������ �Ű����� �򰥸�
	static void fractionalNo(int x) {
		int count = 1;
		int m = 0;
		int n = 0;

		while (true) {
			int sum = 1;
			for (int i = 0; i < count; i++) {
				sum += i;
			}
//			System.out.println("sum: "+sum);
			if ((x - sum) < count) {
				if (count % 2 == 0) {
					m = count;
					n = 1;
//					System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					for (int j = 1; j < (x - sum) + 1; j++) {
						m--;
						n++;
//						System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					}
					break;
				} else {
					n = count;
					m = 1;
//					System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					for (int j = 1; j < (x - sum) + 1; j++) {
						n--;
						m++;
//						System.out.println("count: " + count + " / m : " + m + " / n : " + n);
					}
					break;
				}

			} else {
				count++;
			}
		}
		System.out.println(n + "/" + m);
	}
}

// �׽�Ʈ �ڵ�
class testMath_1193 {

	private int x = (int) (Math.random() * 20 + 1);

	void testCase() {
		double startTime = System.currentTimeMillis();

		System.out.println("�Է°�: " + x);
		Math_1193.fractionalNo(x);

		double endTime = System.currentTimeMillis();
		double testTime = (endTime - startTime) / 1000;
		System.out.println("�׽�Ʈ�ð�: " + testTime + " ��");
	}
}
