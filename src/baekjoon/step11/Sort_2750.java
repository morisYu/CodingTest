package baekjoon.step11;

// �� �����ϱ�
// �ð� ���⵵�� O(n^2)�� ���� �˰���.(��������, ��ǰ ����)

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2750 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int N = scanner.nextInt();
//		int[] array = new int[N];
//
//		for (int i = 0; i < N; i++) {
//			array[i] = scanner.nextInt();
//		}
//		
//		for(int i=0;i<N;i++) {
//			System.out.println(bubble(array)[i]);
//		}
		
		testSort_2750.testCase();
	}

	// ��������
	// �ش� �ε����� ���ڿ� �� ���� ���ڸ� ��
	// ���� ���ں��� ũ�� �� ������ �ʿ� ����
	static int[] insertion(int[] array) {
		int tmp = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
				}else {
					break;
				}
			}
		}
		return array;
	}
	
	// ��������
	// ���� �տ������� �ٷ� ���� ���� ���ؼ� ����
	// �� �ܰ谡 ����ɶ����� ���� �ڿ��� ū ���� �ϳ��� ä����
	static int[] bubble(int[] array) {
		int tmp = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		return array;
	}
}

class testSort_2750 {
	static void testCase() {
		int N = (int) (Math.random() * 10) + 1;
		int[] array = new int[N];
		con: while (true) {
			for (int i = 0; i < N; i++) {
				array[i] = (int) (Math.random() * 30) + 1;
			}
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					if(array[i]==array[j]) {
						continue con;
					}
				}
			}
			break;
		}
		System.out.println("�Է°�: "+N+"\n"+Arrays.toString(array));
		double t1 = System.nanoTime();
		System.out.println("�����(��������):\n"+Arrays.toString(Sort_2750.insertion(array)));
		double t2 = System.nanoTime();
		System.out.println("���۽ð�: "+(t2-t1)+"\n");
		
		t1 = System.nanoTime();
		System.out.println("�����(��������):\n"+Arrays.toString(Sort_2750.bubble(array)));
		t2 = System.nanoTime();
		System.out.println("���۽ð�: "+(t2-t1));
	}
}













