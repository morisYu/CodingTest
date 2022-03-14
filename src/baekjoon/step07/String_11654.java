package baekjoon.step07;

// 아스키코드
// 아스키코드에 대해 알아보는 문제

import java.util.Scanner;

public class String_11654 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		char[] ch = str.toCharArray();
		int i = (int) ch[0];
		
		System.out.println(i);
	}
}
