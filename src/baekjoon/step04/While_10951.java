package baekjoon.step04;

// A+B-4
// 입력이 끝날 때까지 A+B 를 출력하는 문제, EOF에 대해 알아 보세요.

/* 정수 외 다른 문자가 입력되면 프로그램 종료하도록 코드 작성
 두 가지 방법 사용*/

import java.util.Scanner;

public class While_10951 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int A;
		int B;

		//방법1. Scanner 메소드 "hasNextInt()" 사용
//		while (scanner.hasNextInt()) {
//
//			int A = scanner.nextInt();
//			int B = scanner.nextInt();
//
//			System.out.println(A + B);
//		}
//		
		//방법2. try / catch 문 사용
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
