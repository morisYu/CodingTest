package baekjoon.step09;

// 하노이 탑 이동순서
// 재귀적인 패턴을 재귀함수로 찍는 문제 2
// 재귀함수 공부 더 필요함.

import java.util.Scanner;

public class Recursion_11729 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		
		sb.append(((int) Math.pow(2, n) - 1)+"\n");
		hanoiMove(n, 1, 2, 3);
		System.out.println(sb);
	}

	static int hanoiCount(int n) {
		int result = (int) Math.pow(2, (n - 1));
		if (n == 1) {
			result = 1;
		} else {
			result = result + hanoiCount(n - 1);
		}

		return result;
	}

	static void hanoiMove(int n, int start, int mid, int to) {
		if (n == 1) {
			sb.append(start+" "+to+"\n");
			return;
		} else {
			hanoiMove((n - 1), start, to, mid);
			sb.append(start+" "+to+"\n");
			hanoiMove((n - 1), mid, start, to);
		}

	}

}
