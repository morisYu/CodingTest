package baekjoon.step05;

// �ִ�
// �ִ��� ��� �ִ��� ã�� ����

/*
 * 1 ��° ���ڰ� �ִ��� ��쿡 count �� ������ �� ���� ������
 * max �� �ʱ갪�� int Ÿ���� �ּڰ�(a) ���� �����ϰų� for ������
 * max <= array[i] �� ������ ������ ��.
 */

import java.util.Scanner;

public class Array_2562 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[9];

		for (int i = 0; i < 9; i++) {
			array[i] = scanner.nextInt();
		}
		
		//int a = Integer.MIN_VALUE;
		int max = array[0];
		int count = 0;

		for (int i = 0; i < 9; i++) {
			if (max <= array[i]) {
				max = array[i];
				count = i + 1;
			}
		}
		//System.out.println(a);
		System.out.println(max + "\n" + count);
	}
}
