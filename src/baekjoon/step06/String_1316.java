package baekjoon.step07;

// 그룹 단어 체커
// 조건에 맞는 문자열을 찾는 문제

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
				System.out.println("테스트 결과 = " + test(str[i]));
				count++;
			}
		}
		System.out.println(count);
	}

	// 문자열 내 같은 문자가 있을 때, 문자 위치 차이가 1보다 작을 때 true, 1보다 클 때 false
	// 문자 비교는 i 번쨰 문자 뒤에 있는 문자들만 비교하면 됨(i 번째 문자는 이미 이전 문자에서 비교되었기 때문에)
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
