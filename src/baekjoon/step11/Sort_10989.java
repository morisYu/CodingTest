package baekjoon.step11;

// 수 정렬하기3
// 수의 범위가 작다면 카운팅 정렬을 사용하여 더욱 빠르게 정렬할 수 있습니다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sort_10989 {
	// 입출력 데이터가 많을 경우에는 BufferedReader/BufferedWriter를 사용해야 시간 단축
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());

		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		int[] result = countingSort(array);
		for (int value : result) {
			bw.write(value + "\n");
		}
		bw.flush();

//		TestSort_10989.testCase();
	}

	static int[] countingSort(int[] array) {
		int[] count = new int[max(array) + 1];
		int[] countSum = new int[count.length];
		int[] result = new int[array.length];

		// count 배열 값 대입
		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
		}

		// count 배열 확인
//		System.out.println("count 배열");
//		for (int i = 0; i < count.length; i++) {
//			System.out.println(i + " : " + count[i]);
//		}

		// countSum 배열 값 대입
		countSum = count;
		for (int i = 1; i < countSum.length; i++) {
			countSum[i] += countSum[i - 1];
		}

		// countSum 배열 확인
//		System.out.println("countSum 배열");
//		for (int i = 0; i < countSum.length; i++) {
//			System.out.println(i + " : " + countSum[i]);
//		}

		// array 배열 정렬(result 배열)
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			result[countSum[value] - 1] = value;
			countSum[value]--;
		}

		// result 배열 확인
//		System.out.println("result 배열");
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(i + " : " + result[i]);
//		}

		return result;
	}

	static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}

// 테스트 코드
class TestSort_10989 {
	static void testCase() {
		int N = (int) (Math.random() * 8) + 2;
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println("입력값\nN: " + N);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("------------------");

		Sort_10989.countingSort(array);
	}
}
