package baekjoon.step09;

// �ϳ��� ž �̵�����
// ������� ������ ����Լ��� ��� ���� 2
// ����Լ� ���� �� �ʿ���.

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
