package baekjoon.step04;

// ������ ����
// �� ���ڰ� �� �� ���Դ��� �����ϱ� ���� ������ �迭�� ����� ����

import java.util.Scanner;

public class Array_2577 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int result = A * B * C;
		int[] count = new int[10];
		String str = Integer.toString(result);
//		System.out.println(str);
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < 10; j++) {
				if (ch[i]-'0' == j) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}
}
