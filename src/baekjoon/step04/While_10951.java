package baekjoon.step04;

// A+B-4
// �Է��� ���� ������ A+B �� ����ϴ� ����, EOF�� ���� �˾� ������.

/* ���� �� �ٸ� ���ڰ� �ԷµǸ� ���α׷� �����ϵ��� �ڵ� �ۼ�
 �� ���� ��� ���*/

import java.util.Scanner;

public class While_10951 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int A;
		int B;

		//���1. Scanner �޼ҵ� "hasNextInt()" ���
//		while (scanner.hasNextInt()) {
//
//			int A = scanner.nextInt();
//			int B = scanner.nextInt();
//
//			System.out.println(A + B);
//		}
//		
		//���2. try / catch �� ���
		do {
			try {
				A = scanner.nextInt();
				B = scanner.nextInt();
			} catch (Exception e) {
				break;
			}
			System.out.println(A + B);
		} while (true);
	}
}
