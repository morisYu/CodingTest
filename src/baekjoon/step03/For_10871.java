package baekjoon.step03;

// X보다 작은 수
// for와 if를 같이 쓴느 문제

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
