package baekjoon.step06;

// 다이얼
// 규칙에 따라 문자에 대응하는 수를 출력하는 문제

import java.util.Scanner;

public class String_5622 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		char[] ch = str.toCharArray();
		int[] number = new int[ch.length];
		
		for (int i = 0; i < ch.length; i++) {
			number[i] = dial(ch[i]);
		}
		
		System.out.println(timer(number));
	}
	
	static int dial(char ch) {
		
		if(ch=='A'||ch=='B'||ch=='C') {
			return 2;
		}else if(ch=='D'||ch=='E'||ch=='F') {
			return 3;
		}else if(ch=='G'||ch=='H'||ch=='I') {
			return 4;
		}else if(ch=='J'||ch=='K'||ch=='L') {
			return 5;
		}else if(ch=='M'||ch=='N'||ch=='O') {
			return 6;
		}else if(ch=='P'||ch=='Q'||ch=='R'||ch=='S') {
			return 7;
		}else if(ch=='T'||ch=='U'||ch=='V') {
			return 8;
		}else if(ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
			return 9;
		}else {
			return 0;
		}
	}
	
	static int timer(int[] number) {
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum+=number[i]+1;
		}
		return sum;
	}
	
	
}
