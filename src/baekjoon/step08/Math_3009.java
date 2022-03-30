package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 네번째 점
// 직사각형을 완성하는 문제
// 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위한 네번째 점 찾기

public class Math_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringTokenizer st = null;
		int[] xArray = new int[4];
		int[] yArray = new int[4];

		for (int i = 0; i < 3; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			xArray[i] = Integer.parseInt(st.nextToken());
			yArray[i] = Integer.parseInt(st.nextToken());
		}

		recPoint(xArray, yArray);

//		testMath_3009.testCase();

	}

	// 축에 평행한 직사각형이기 때문에 x 값은 두 개씩 같고, y 값도 2 개씩 같음
	static void recPoint(int[] xArray, int[] yArray) {

		for (int i = 1; i < 4; i++) {
			if (xArray[0] == xArray[i]) {
				xArray[0] = 0;
				xArray[i] = 0;
			}
			if (yArray[0] == yArray[i]) {
				yArray[0] = 0;
				yArray[i] = 0;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (xArray[i] != 0) {
				xArray[3] = xArray[i];
				break;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (yArray[i] != 0) {
				yArray[3] = yArray[i];
				break;
			}
		}
		System.out.println(xArray[3] + " " + yArray[3]);

	}
}

// 테스트 코드
class testMath_3009 {
	static void testCase() {
		int[] xArray = new int[4];
		int[] yArray = new int[4];
		int xPosition = 0;
		int yPosition = 0;

		con: while (true) {
			xArray[0] = (int) (Math.random() * 10) + 1;
			yArray[0] = (int) (Math.random() * 10) + 1;

			xPosition = (int) (Math.random() * 2) + 1;
			yPosition = (int) (Math.random() * 2) + 1;

			xArray[xPosition] = xArray[0];
			yArray[yPosition] = yArray[0];

			if (xPosition == 3) {
				xArray[1] = (int) (Math.random() * 10) + 1;
				xArray[2] = xArray[1];
			} else if (xPosition == 2) {
				xArray[1] = (int) (Math.random() * 10) + 1;
				xArray[3] = xArray[1];
			} else if (xPosition == 1) {
				xArray[2] = (int) (Math.random() * 10) + 1;
				xArray[3] = xArray[2];
			}

			if (yPosition == 3) {
				yArray[1] = (int) (Math.random() * 10) + 1;
				yArray[2] = yArray[1];
			} else if (yPosition == 2) {
				yArray[1] = (int) (Math.random() * 10) + 1;
				yArray[3] = yArray[1];
			} else if (yPosition == 1) {
				yArray[2] = (int) (Math.random() * 10) + 1;
				yArray[3] = yArray[2];
			}
			
			if(xArray[0]==xArray[1]&&xArray[1]==xArray[2]) {
				continue con;
			}
			
			if(yArray[0]==yArray[1]&&yArray[1]==yArray[2]) {
				continue con;
			}
			
			for (int i = 0; i < 3; i++) {
				for (int j = i + 1; j < 3; j++) {
					if (xArray[i] == xArray[j] && yArray[i] == yArray[j]) {
						continue con;
					}
				}
			}
			break;
		}

//		xArray[3] = 0;
//		yArray[3] = 0;

		System.out.println("입력값");
		for (int i = 0; i < 3; i++) {
			System.out.println("x= " + xArray[i] + " , y= " + yArray[i]);
		}

		Math_3009.recPoint(xArray, yArray);

	}
}
