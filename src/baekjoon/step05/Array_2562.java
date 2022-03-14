package baekjoon.step05;

// 최댓값
// 최댓값이 어디에 있는지 찾는 문제

/*
 * 1 번째 숫자가 최댓값일 경우에 count 가 설정될 수 없기 때문에
 * max 의 초깃값을 int 타입의 최솟값(a) 으로 설정하거나 for 문에서
 * max <= array[i] 로 조건을 잡아줘야 함.
 */

import java.util.Scanner;

public class Array_2562 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[9];

		for (int i = 0; i < 9; i++) {
			array[i] = scanner.nextInt();
		}
		
		//int a = Integer.MIN_VALUE;
		int max = array[0];
		int count = 0;

		for (int i = 0; i < 9; i++) {
			if (max <= array[i]) {
				max = array[i];
				count = i + 1;
			}
		}
		//System.out.println(a);
		System.out.println(max + "\n" + count);
	}
}
