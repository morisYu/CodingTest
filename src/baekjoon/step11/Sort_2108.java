package baekjoon.step11;

// �����
// ������ Ȱ���ϴ� ����
// ������, �߾Ӱ�, �ֺ�, ������ ���ϴ� ����

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

		// �հ�
		for (int value : array) {
			sum += value;
		}
//		System.out.println("sum: " + sum);

		// ���(�ݿø�)
		avg = (int) Math.round((double) sum / array.length);
//		System.out.println("avg: " + avg);

		// �߰���
		medium = array[(int) array.length / 2];
//		System.out.println("medium: " + medium);

		// ����
		range = array[array.length - 1] - array[0];
//		System.out.println("range: " + range);

		// �ֺ�
		ArrayList<Integer> arrayList = new ArrayList<>();

		int[] tmp = new int[8001];

		for (int i = 0; i < array.length; i++) {
			tmp[array[i] + 4000]++;
		}

		// tmp �迭 Ȯ��
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
		System.out.println("�Է°�");
		System.out.println("N: "+N);
		for(int value : array) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		Sort_2108.statistics(array);
	}
}
