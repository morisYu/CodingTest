package baekjoon.step7;

// 크로아티아 알파벳
// 크로아티아 알파벳의 개수를 세는 문제

import java.util.Scanner;

public class String_2941 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		System.out.println("문자열 길이" + str.length());

		hasCroatia(str);

	}

	// 크로아티아 문자 찾아서 "0" 으로 치환
	static void hasCroatia(String str) {
		String[] croAlpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for (int i = 0; i < croAlpha.length; i++) {
			while (true) {
				if (str.indexOf(croAlpha[i]) >= 0) {
					System.out.println("Alpha: " + croAlpha[i] + " index: " + str.indexOf(croAlpha[i]));
					str = str.substring(0, str.indexOf(croAlpha[i]))+"0"
							+ str.substring(str.indexOf(croAlpha[i]) + croAlpha[i].length());
					System.out.println(croAlpha[i]+" 제거 후: "+str);
				} else {
					break;
				}
			}
		}
		System.out.println("str.length: " + str.length());
		System.out.println(str.length());
	}
	
	// 크로아티아 문자를 제거하면서 카운트 증가하고 남은 문자의 갯수와 카운트를 더해서 문자 수 계산
	// lljj 와 같이 중간에 "lj" 를 제거하면서 남은 문자가 합쳐지면서 다시 "lj"가 만들어져서 오답 발생
	// 제거한 문자 위치에 다른 문자를 삽입해서 남은 총 문자수를 계산하도록 수정
	
//	static int hasCroatiaFail(String str) {
//		String[] croAlpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
//		int count = 0;
//		for (int i = 0; i < croAlpha.length; i++) {
//			while (true) {
//				if (str.indexOf(croAlpha[i]) >= 0) {
//					System.out.println("Alpha: " + croAlpha[i] + " index: " + str.indexOf(croAlpha[i]));
//					count++;
//					str = str.substring(0, str.indexOf(croAlpha[i]))
//							+ str.substring(str.indexOf(croAlpha[i]) + croAlpha[i].length());
//					System.out.println(croAlpha[i]+" 제거 후: "+str);
//				} else {
//					break;
//				}
//			}
//		}
//		System.out.println("str.length: " + str.length());
//		System.out.println(count + str.length());
//		return count;
//	}
}
