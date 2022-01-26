package baekjoon.step1;

// A+B
// 두 수를 입력받고 합을 출력하는 문제

import java.util.Scanner;

public class IOandOperation_1000 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		System.out.println(A + B);
	}
}
