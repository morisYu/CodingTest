package baekjoon.step11;

// �� �����ϱ�2
// �ð� ���⵵�� O(nlogn) �� ���� �˰���
// ���� ����, �� ����(����� ���� �Լ� ��� ����)

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2751 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		for(int i = 0;i < N;i++) {
			sb.append(array[i]+"\n");
		}
		System.out.println(sb);

//		testSort_2751.testCase();
	}

	// Arrays Ŭ������ �ִ� sort() �޼ҵ� ���
	static int[] innerSort(int[] array) {
		Arrays.sort(array);
		return array;
	}

	// �������Ʈ(https://www.daleseo.com/sort-merge/)
	static void mergeSort(int[] array) {
		sort(array, 0, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static void sort(int[] array, int low, int high) {
		if (high - low < 2) {
			return;
		}
		int mid = (low + high) / 2;
		System.out.println("l: "+low+" m: "+mid+" h:"+high);
		sort(array, 0, mid);
		System.out.println("�����ܰ�1");
		sort(array, mid, high);
		System.out.println("�����ܰ�2");
		merge(array, low, mid, high);
	}

	static void merge(int[] array, int low, int mid, int high) {
		System.out.println("low: "+low+" mid: "+mid+ " high: "+high);
		int[] tmp = new int[high - low];
		int t = 0;
		int l = low;
		int h = mid;

		while (l < mid && h < high) {
			if (array[l] < array[h]) {
				tmp[t++] = array[l++];
			} else {
				tmp[t++] = array[h++];
			}
		}

		while (l < mid) {
			tmp[t++] = array[l++];
		}

		while (h < high) {
			tmp[t++] = array[h++];
		}

		for (int i = low; i < high; i++) {
			array[i] = tmp[i - low];
		}
	}
}

class testSort_2751 {
	static void testCase() {
		int N = (int) (Math.random() * 8) + 3;
		int[] array = new int[N];

		System.out.print("�Է°�: " + N + "\n�迭: ");
		con: while (true) {
			for (int i = 0; i < N; i++) {
				array[i] = (int) (Math.random() * 10) + 1;
			}
			for (int i = 0; i < N - 1; i++) {
				for (int j = i+1; j < N; j++) {
					if (array[i] == array[j]) {
						continue con;
					}
				}
			}
			break;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		Sort_2751.mergeSort(array);
	}
}
