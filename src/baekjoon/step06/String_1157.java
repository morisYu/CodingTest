package baekjoon.step06;

// 단어 공부
// 주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제

import java.util.Scanner;

public class String_1157 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		char[] ch = str.toCharArray();
		int[] count = new int[26];

		for (int i = 0; i < ch.length; i++) {
			if ((int) ch[i] > 90) {
				for (int j = 97; j <= 122; j++) {
					if ((int) ch[i] == j) {
						count[j - 97]++;
						break;
					}
				}
			} else if ((int) ch[i] <= 90) {
				for (int k = 65; k <= 90; k++) {
					if ((int) ch[i] == k) {
						count[k - 65]++;
						break;
					}
				}
			}
		}

//		for (int i = 65; i <= 90; i++) {
//			System.out.println((char) i + " - " + count[i-65]);
//		}
		
		int max=count[0];
		int maxNo=0;
		for(int i=1;i<count.length;i++) {
			if(max<count[i]) {
				max=count[i];
				maxNo=i;
			}
		}
		
		int result=0;
		for(int i=0;i<count.length;i++) {
			if(count[maxNo]==count[i]) {
				result++;
			}
		}
		
		if(result>1) {
			System.out.println("?");
		}else {
			System.out.println((char) (maxNo+65));
		}
		
	}
}












