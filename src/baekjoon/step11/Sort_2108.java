package baekjoon.step11;

// 통계학
// 정렬을 활용하는 문제
// 산술평균, 중앙값, 최빈값, 범위를 구하는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort_2108 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
//		int N = Integer.parseInt(br.readLine());
//		int[] array = new int[N];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = Integer.parseInt(br.readLine());
//		}
//
//		statistics(array);
		
		TestSort_2108.testCase();
	}

	static void statistics(int[] array) {
		Arrays.sort(array);
		int sum = 0;
		int avg = 0;
		int medium = 0;
		int mode = 0;
		int range = 0;

		// 합계
		for (int value : array) {
			sum += value;
		}
//		System.out.println("sum: " + sum);

		// 평균(반올림)
		avg = (int) Math.round((double) sum / array.length);
//		System.out.println("avg: " + avg);

		// 중간값
		medium = array[(int) array.length / 2];
//		System.out.println("medium: " + medium);

		// 범위
		range = array[array.length - 1] - array[0];
//		System.out.println("range: " + range);

		// 최빈값
		ArrayList<Integer> arrayList = new ArrayList<>();

		int[] tmp = new int[8001];

		for (int i = 0; i < array.length; i++) {
			tmp[array[i] + 4000]++;
		}

		// tmp 배열 확인
//		for (int i = 0; i < tmp.length; i++) {
//			if (tmp[i] != 0) {
//				System.out.println(i + " : " + tmp[i]);
//			}
//		}

		int max = 0;
		int max_count = 0;

		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] > max) {
				max = tmp[i];
			}
		}

		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] == max) {
				arrayList.add(i - 4000);
				max_count++;
			}
		}

//		for (int value : arrayList) {
//			System.out.println(value);
//		}

		if (max_count > 1) {
			mode = arrayList.get(1);
		} else {
			mode = arrayList.get(0);
		}

		sb.append(avg + "\n");
		sb.append(medium + "\n");
		sb.append(mode + "\n");
		sb.append(range + "\n");
		System.out.println(sb);
	}
}

class TestSort_2108 {
	static void testCase() {
		int N = (int) (Math.random() * 5) * 2 + 1;
		int[] array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 30) - 10;
		}
		System.out.println("입력값");
		System.out.println("N: "+N);
		for(int value : array) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		Sort_2108.statistics(array);
	}
}
