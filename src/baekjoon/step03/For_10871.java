package baekjoon.step03;

// X���� ���� ��
// for�� if�� ���� ���� ����

import java.util.Scanner;

public class For_10871 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int X = scanner.nextInt();

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < X) {
				System.out.print(array[i]);
				System.out.print(" ");
			}
		}
	}
}
