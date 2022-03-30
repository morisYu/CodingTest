package baekjoon.step11;

// 수 정렬하기
// 시간 복잡도가 O(n^2)인 정렬 알고리즘.(삽입정렬, 거품 정렬)

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

	// 삽입정렬
	// 해당 인덱스의 숫자와 그 앞의 숫자를 비교
	// 앞의 숫자보다 크면 더 진행할 필요 없음
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
	
	// 버블정렬
	// 제일 앞에서부터 바로 뒤의 값과 비교해서 정렬
	// 한 단계가 진행될때마다 제일 뒤에는 큰 수가 하나씩 채워짐
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
		System.out.println("입력값: "+N+"\n"+Arrays.toString(array));
		double t1 = System.nanoTime();
		System.out.println("결과값(삽입정렬):\n"+Arrays.toString(Sort_2750.insertion(array)));
		double t2 = System.nanoTime();
		System.out.println("동작시간: "+(t2-t1)+"\n");
		
		t1 = System.nanoTime();
		System.out.println("결과값(버블정렬):\n"+Arrays.toString(Sort_2750.bubble(array)));
		t2 = System.nanoTime();
		System.out.println("동작시간: "+(t2-t1));
	}
}













