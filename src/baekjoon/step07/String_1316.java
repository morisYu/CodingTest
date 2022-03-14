package baekjoon.step07;

// �׷� �ܾ� üĿ
// ���ǿ� �´� ���ڿ��� ã�� ����

import java.util.Scanner;

public class String_1316 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String[] str = new String[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			str[i] = scanner.next();
		}

		for (int i = 0; i < N; i++) {
			if (test(str[i])) {
				System.out.println("�׽�Ʈ ��� = " + test(str[i]));
				count++;
			}
		}
		System.out.println(count);
	}

	// ���ڿ� �� ���� ���ڰ� ���� ��, ���� ��ġ ���̰� 1���� ���� �� true, 1���� Ŭ �� false
	// ���� �񱳴� i ���� ���� �ڿ� �ִ� ���ڵ鸸 ���ϸ� ��(i ��° ���ڴ� �̹� ���� ���ڿ��� �񱳵Ǿ��� ������)
	static boolean test(String str) {
		boolean result = true;

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
//					System.out.println(i + " = " + j);
//					System.out.println(Math.abs(j - i));
					if (Math.abs(j - i) <= 1) {
//						System.out.println("success");
						result = true;
					} else {
						if(ch[j]==ch[j-1]) {
//							System.out.println("continue");
							continue;
						}else {
//							System.out.println("fail");
							result = false;
							return result;
						}
					}
				}
			}
		}
		return result;
	}
}
