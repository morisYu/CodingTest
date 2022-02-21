package baekjoon.step8;

// ����
// ������ �����Ǵ� ��Ģ�� ���� ������ ��ġ�� ���ϴ� ����

import java.util.Scanner;

public class Math_2292 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		System.out.println(beeHive(N));

	}
	
	// 1 �ֺ����� �� ���� ������ �� ���� �ݰ��� 1 �� �ö�.
	// �� �������� �ּҰ��� �ִ밪�� ���ϰ� �ش� ���� ���� ������ �ش� �� �ݰ� �ȿ� �ִ� ������ �Ǵ��Ͽ� �̵� �� ���
	static int beeHive(int N) {
		int result = 0;
		int count = 0;
		int min = 2;
		int max;

		if (N == 1) {
			result = 1;
			return result;
		} else {
			while (true) {
				min = min + 6 * count;
				max = min + (6 * (count + 1)) - 1;
				if (N >= min && N <= max) {
					result = count + 2;
					break;
				} else {
					count++;
				}
			}
			return result;
		}
	}
}

// �׽�Ʈ �ڵ�
class testMath_2292 {
	private int N = (int) (Math.random() * 70 + 1);

	void testCase() {
		System.out.println("�Է°� :" + N);
		System.out.println("����� : " + Math_2292.beeHive(N));
	}

}
