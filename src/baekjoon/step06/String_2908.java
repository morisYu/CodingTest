package baekjoon.step07;

// 상수
// 숫자를 뒤집어서 비교하는 문제

import java.util.Scanner;

public class String_2908 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String A = scanner.next();
		String B = scanner.next();

		char[] chA = A.toCharArray();
		char[] chB = B.toCharArray();
		
		String strA = change(chA);
		String strB = change(chB);
		
		int intA = Integer.parseInt(strA);
		int intB = Integer.parseInt(strB);
		
		int result = compare(intA, intB);
		System.out.println(result);

	}

	static String change(char[] ch) {
		char[] tmp = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {
			tmp[i] = ch[ch.length - 1 - i];
		}

		String str = String.valueOf(tmp);
		return str;
	}

	static int compare(int A, int B) {
		if (A > B) {
			return A;
		} else {
			return B;
		}
	}
}
