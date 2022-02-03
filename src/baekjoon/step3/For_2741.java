package baekjoon.step3;

//N 찍기
//1부터 N까지 출력하는 문제

import java.util.Scanner;

public class For_2741 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
}
