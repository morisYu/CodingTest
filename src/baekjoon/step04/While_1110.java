package baekjoon.step04;

// ���ϱ� ����Ŭ
// ���� ���� ���ƿ� ������ ������ �ݺ��ϴ� ����

/* �� �ڸ� ���� �־����� 10�� �ڸ����� 1�� �ڸ����� ���ϰ� ���� ����� �ٽ�
 * 10�� �ڸ����� 1�� �ڸ����� ������ �� �� �տ��� �־��� ���� 1�� �ڸ����� ����� ����
 * 1�� �ڸ����� �����ؼ� �� �ڸ� ���� ����� ��
 */

import java.util.Scanner;

public class While_1110 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int x;
		int y;
		int z;
		int count = 0;
		int result = A;

		while (true) {
			if (A < 10) {
				x = 0;
				y = A;
			} else {
				x = A / 10;
				y = A % 10;
			}
			z = (x + y) % 10;
			A = y * 10 + z;
			count++;
			System.out.println("x= " + x);
			System.out.println("y= " + y);
			System.out.println("z= " + z);
			System.out.println("count= " + count);
			System.out.println("A= " + A);
			if (result == A) {
				System.out.println(count);
				break;
			}
		}
	}
}
