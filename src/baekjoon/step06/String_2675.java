package baekjoon.step07;

// ���ڿ� �ݺ�
// �� ���ڸ� �ݺ��Ͽ� ����ϴ� ����

import java.util.Scanner;

public class String_2675 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int R = scanner.nextInt();
			String S = scanner.next();
			char[] ch = S.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		}
	}
}
