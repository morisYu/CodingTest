package baekjoon.step07;

// �ܾ��� ����
// �ܾ��� ������ ���ϴ� ����

import java.util.Scanner;

public class String_1152 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		str = str.trim();

		String[] strArray = str.split(" ");

		if (str.isEmpty()) {
			System.out.println(0);
			return;
		} else {
			System.out.println(strArray.length);
		}

//		for (int i = 0; i < strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
	}
}
