package baekjoon.step7;

// 알파벳 찾기
// 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제

import java.util.Scanner;

public class String_10809 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String S = scanner.nextLine();
		char[] ch = S.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i] + " - " + (int) ch[i]);
		}
		con: for (int j = 97; j <= 122; j++) {
			for (int i = 0; i < ch.length; i++) {
				if ((int) ch[i] == j) {
					System.out.print(i + " ");
					continue con;
				}
			}
			System.out.print("-1 ");
		}
	}
}
