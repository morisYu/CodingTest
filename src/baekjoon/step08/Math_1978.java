package baekjoon.step08;

// �Ҽ� ã��
// 2���� x-1���� ��� ������ x�� �Ҽ����� �Ǻ��ϴ� ����1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		String str = br.readLine();
		st = new StringTokenizer(str);
		int[] x = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(st.nextToken());
//			System.out.print(x[i] + " ");
		}

		System.out.println(primeNumber(x));
	}

	static int primeNumber(int[] x) {
		int result = 0;

		con: for (int i = 0; i < x.length; i++) {
			if (x[i] == 1) {
//				System.out.println("1 �� �Ҽ��� �ƴ�");
				continue con;
			}
			for (int j = 2; j < x[i] - 1; j++) {
				if (x[i] % j == 0) {
//					System.out.println(x[i] + " �� �Ҽ��� �ƴ�");
					continue con;
				}
			}
			result++;
		}
		return result;
	}
}

class testMath_1978 {
	static void testCase() {
		int N = (int) (Math.random() * 20 + 2);
		int[] x = new int[N];

		System.out.println("�Է°�: N - " + N);
		System.out.print("�Է°�: ");

		for (int i = 0; i < N; i++) {
			x[i] = (int) (Math.random() * 100 + 1);
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("�����: " + Math_1978.primeNumber(x));
	}
}
