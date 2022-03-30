package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 터렛
// 두 원의 교점의 개수를 구하는 문제
// 두 개의 점에서 각각 일정한 거리에 있는 다른 한 점의 좌표 갯수

public class Math_1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		int x1, y1, r1, x2, y2, r2;

		for (int i = 0; i < t; i++) {
			String tmp = br.readLine();
			st = new StringTokenizer(tmp);
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			sb.append(turret2(x1, y1, r1, x2, y2, r2) + "\n");
		}

		System.out.print(sb);

//		testMath_1002.testCase();

	}

	// 접점 개수 구하는 함수(정답 코드)
	public static int turret1(int x1, int y1, int r1, int x2, int y2, int r2) {
		// 중점간 거리 distance의 제곱
		int distance_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		// case 1 : 중점이 같으면서 반지름도 같을 경우
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		// case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
		else if (distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}
		// case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
		else if (distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		// case 3-1 : 내접할 때
		else if (distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		// case 3-2 : 외접할 때
		else if (distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		} else {
			return 2;
		}
	}

	// 성화 코드(접점이 2개인 경우의 수가 많음(테스트 코드 돌리면 반례 나옴))
	// 실수타입은 동등비교하면 오차때문에 안됨
	// 가능하면 정수타입으로 숫자 비교해야 함
	static int turret2(int x1, int y1, int r1, int x2, int y2, int r2) {
		int result = 0;

		int xDis_pow = (int) Math.pow((x2 - x1), 2);
		int yDis_pow = (int) Math.pow((y2 - y1), 2);
		int rDis_pow = (int) Math.pow((r2 + r1), 2);
		int rDiff_pow = (int) Math.pow((r2 - r1), 2);
		int distance_pow = xDis_pow + yDis_pow;

//		System.out.println("xDis_pow = " + xDis_pow);
//		System.out.println("yDis_pow = " + yDis_pow);
//		System.out.println("rDis_pow = " + rDis_pow);
//		System.out.println("rDiff_pow = " + rDiff_pow);
//		System.out.println("distance_pow = " + distance_pow);

		// 두 점이 같은 위치에 있을 때
		if (xDis_pow == 0 && yDis_pow == 0) {
//			System.out.println("두 점의 위치가 같음");
			if (r1 == r2) {
//				System.out.println("r1 == r2");
				result = -1;
				return result;
			} else {
//				System.out.println("r1 != r2");
				result = 0;
				return result;
			}
		}

		// 두 점이 다른 위치에 있을 때(중심점이 다른 원 밖에 위치)
		if (distance_pow > (int) Math.pow(r1, 2) && distance_pow > (int) Math.pow(r2, 2)) {
//			System.out.println("두 점이 모두 다른 원 밖에 위치");
			if (distance_pow > rDis_pow) {
//				System.out.println("distance > rDis");
				result = 0;
			} else if (distance_pow < rDis_pow) {
//				System.out.println("distance < rDis");
				result = 2;
			} else {
//				System.out.println("distance == rDis");
				result = 1;
			}
		}

		// 두 점이 다른 위치에 있을 때(중심점이 다른 다른 원 안에 위치)
		if (distance_pow < (int) Math.pow(r1, 2) || distance_pow < (int) Math.pow(r2, 2)) {
//			System.out.println("두 점이 다른 원 안에 위치");
			if (distance_pow == rDiff_pow) {
//				System.out.println("distance == rDiff");
				result = 1;
			} else if (distance_pow < rDiff_pow) {
//				System.out.println("distance < rDiff");
				result = 0;
			} else {
//				System.out.println("distance > rDiff");
				result = 2;
			}

		}

		// 한 점이 다른 점 위에 있을 때
		if (distance_pow == r1 || distance_pow == r2) {
//			System.out.println("한 점이 다른 원 위에 위치");
			result = 2;
		}
		return result;
	}
}

// 테스트 코드
class testMath_1002 {
	static void testCase() {

		int x1, y1, r1, x2, y2, r2;
		while (true) {
			x1 = (int) (Math.random() * 200) - 100;
			y1 = (int) (Math.random() * 200) - 100;
			r1 = (int) (Math.random() * 200) + 1;
			x2 = (int) (Math.random() * 200) - 100;
			y2 = (int) (Math.random() * 200) - 100;
			r2 = (int) (Math.random() * 200) + 1;
			
			int xDis_pow = (int) Math.pow((x2 - x1), 2);
			int yDis_pow = (int) Math.pow((y2 - y1), 2);
			int rDis_pow = (int) Math.pow((r2 + r1), 2);
			int rDiff_pow = (int) Math.pow((r2 - r1), 2);
			int distance_pow = xDis_pow + yDis_pow;

			if (Math_1002.turret1(x1, y1, r1, x2, y2, r2) != Math_1002.turret2(x1, y1, r1, x2, y2, r2)) {
				System.out.println("입력값: " + x1 + " " + y1 + " " + r1 + " " + x2 + " " + y2 + " " + r2);

				System.out.println("xDis_pow = " + xDis_pow);
				System.out.println("yDis_pow = " + yDis_pow);
				System.out.println("rDis_pow = " + rDis_pow);
				System.out.println("rDiff_pow = " + rDiff_pow);
				System.out.println("distance_pow = " + distance_pow);
				System.out.println("결과값1: " + Math_1002.turret1(x1, y1, r1, x2, y2, r2));
				System.out.println("결과값2: " + Math_1002.turret2(x1, y1, r1, x2, y2, r2));
				System.out.println();
				System.out.println("--------------------------------");
				break;
			}
		}
	}
}
