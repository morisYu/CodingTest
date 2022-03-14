package baekjoon.step04;

// 더하기 사이클
// 원래 수로 돌아올 때까지 연산을 반복하는 문제

/* 두 자리 수가 주어지면 10의 자리수와 1의 자리수를 더하고 나온 결과를 다시
 * 10의 자리수와 1의 자리수로 나누어 준 뒤 앞에서 주어진 수의 1의 자리수와 결과로 나온
 * 1의 자리수를 조합해서 두 자리 수로 만들어 줌
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
