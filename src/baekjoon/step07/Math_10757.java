package baekjoon.step07;

//큰 수 A+B
//크기가 큰 정수 A+B를 입력받은 다음, A+B를 출력하는 프로그램을 작성

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Math_10757 {
	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//		String argA = st.nextToken();
//		String argB = st.nextToken();
//
//		System.out.println(method2(argA, argB));

		testMath_10757.testCase();
	}

	// BigInteger 클래스 사용
	static String method1(String argA, String argB) {
		String result = null;

		BigInteger A = new BigInteger(argA);
		BigInteger B = new BigInteger(argB);

		result = A.add(B).toString();

		return result;
	}

	// 배열 사용
	static String method2(String argA, String argB) {
		String result = null;

		char[] chA = argA.toCharArray();
		char[] chB = argB.toCharArray();

		int length;

		if (chA.length >= chB.length) {
			length = chA.length + 1;
		} else {
			length = chB.length + 1;
		}

		int[] changeArrayA = new int[chA.length];
		int[] changeArrayB = new int[chB.length];

		int[] arrayA = new int[length];
		int[] arrayB = new int[length];

		for (int i = 0; i < chA.length; i++) {
			changeArrayA[i] = Character.getNumericValue(chA[chA.length - i - 1]);
			arrayA[i] = changeArrayA[i];
		}

		for (int i = 0; i < chB.length; i++) {
			changeArrayB[i] = Character.getNumericValue(chB[chB.length - i - 1]);
			arrayB[i] = changeArrayB[i];
		}

//		for (int i = 0; i < length; i++) {
//			System.out.println(arrayA[i] + " - " + arrayB[i]);
//		}

		int[] sum = new int[length];

		for (int k = 0; k < length; k++) {
			sum[k] += arrayA[k] + arrayB[k];
			if (sum[k] >= 10) {
				sum[k] -= 10;
				sum[k + 1] += 1;
			}
		}

		int[] changeSum = new int[length];
		for (int i = 0; i < length; i++) {
			changeSum[i] = sum[length - i - 1];
		}
		result = Arrays.toString(changeSum).replaceAll("[^0-9]","");
		if(result.charAt(0)=='0') {
			result=result.substring(1);
		}
		return result;
	}
}

// 테스트코드
class testMath_10757 {
	static void testCase() {
		int A = (int) (Math.random() * 10000000);
		int B = (int) (Math.random() * 10000000);

		String argA = Integer.toString(A);
		String argB = Integer.toString(B);

		System.out.println("argA = " + argA);
		System.out.println("argB = " + argB);

		System.out.println(Math_10757.method2(argA, argB));

	}
}