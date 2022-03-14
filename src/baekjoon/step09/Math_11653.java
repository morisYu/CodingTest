package baekjoon.step09;


// ���μ�����(1 ���� ū ������ �Ҽ��� ������ ǥ��)
// N�� ���μ������ϴ� ����

import java.util.Scanner;
import java.util.Arrays;

public class Math_11653 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();

		factorization(N);
		
//		testMath_11653.testCase();
	}

	static void factorization(int N) {
		StringBuilder sb = new StringBuilder();
//		int[] array = primeNumber(N);
		
		int tmp=N;
		
		for(int i=2;i<=N;i++) {
			while(true) {
				if(tmp%i==0) {
					tmp=tmp/i;
					sb.append(i).append('\n');
				}else {
					break;
				}
			}
		}
		
//		for(int i=0;i<array.length;i++) {
//			while(true) {
//				if(tmp%array[i]==0) {
//					tmp=tmp/array[i];
//					System.out.println("���: "+tmp);
//					sb.append(array[i]).append('\n');
//				}else {
//					break;
//				}
//			}
//		}
		System.out.println(sb);
	}

	// �Ҽ��� ���ؼ� ����� �ϸ� �ð��ʰ�
	// ���ڰ� 4�� ��� �̹� 2 �� �ݺ������� �������־��� ������ 4�� �������� ��찡 �߻����� ����
	static int[] primeNumber(int N) {
		int[] array = new int[N - 1];
		int size = 0;
		int[] result;

		con: for (int i = 2; i <= N; i++) {
			if (i == 1) {
				continue con;
			}
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					continue con;
				}
			}
			array[i - 2] = i;
			size++;
		}

//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
		Arrays.sort(array);
		result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[result.length - i - 1] = array[array.length - i - 1];
		}

//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}

		return result;
	}
}

class testMath_11653 {
	static void testCase() {
		int N = (int) (Math.random() * 50+2);
		System.out.println("�Է°�: "+N);
		
		Math_11653.factorization(N);
	}
}
