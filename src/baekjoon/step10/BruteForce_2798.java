package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���Ʈ����: ��� ����� ���� �˻�
// ����
// �� ���� ī�带 ���� ��� ��츦 ����ϴ� ����

public class BruteForce_2798 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String firstLine = br.readLine();
		StringTokenizer firstToken = new StringTokenizer(firstLine);
		int N = Integer.parseInt(firstToken.nextToken());
		int M = Integer.parseInt(firstToken.nextToken());
		int[] array = new int[N];

		String secondLine = br.readLine();
		StringTokenizer secondToken = new StringTokenizer(secondLine);

		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(secondToken.nextToken());
//			System.out.println(array[i]);
		}

		System.out.println(blackJack(array, M));

//		TestBruteForce_2798.testCase();

	}

	// �� ���� ���� M�� ���� �ʾƾ� ��.
	// sum�� ����ؼ� �ִ밪�� max�� ����
	// M ���� �۰ų� ���� �� �߿��� ���� ū ���� M �� ���� ����� ��
	static int blackJack(int[] array, int M) {
		int sum = 0;
		int max = 0;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					sum = array[i] + array[j] + array[k];
					if(max < sum && sum <= M) {
						max = sum;
					}
				}
			}
		}
		
		return max;
	}
}

class TestBruteForce_2798 {
	static void testCase() {
		int N = (int) (Math.random() * 10) + 3;
		int M = (int) (Math.random() * 1000) + 10;
		int[] array = new int[N];

		System.out.println("�Է°�: N= " + N + " , M= " + M);
		for (int i = 0; i < N; i++) {
			array[i] = (int) (Math.random() * M / 2) + 1;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		System.out.println("���");
		System.out.println("-----------------");
		System.out.println(BruteForce_2798.blackJack(array, M));

	}
}