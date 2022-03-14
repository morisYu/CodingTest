package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ͷ�
// �� ���� ������ ������ ���ϴ� ����
// �� ���� ������ ���� ������ �Ÿ��� �ִ� �ٸ� �� ���� ��ǥ ����

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

	// ���� ���� ���ϴ� �Լ�(���� �ڵ�)
	public static int turret1(int x1, int y1, int r1, int x2, int y2, int r2) {
		// ������ �Ÿ� distance�� ����
		int distance_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		// case 1 : ������ �����鼭 �������� ���� ���
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		// case 2-1 : �� ���� ������ �պ��� ������ �Ÿ��� �� �� ��
		else if (distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}
		// case 2-2 : �� �ȿ� ���� ������ �������� ���� ��
		else if (distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		// case 3-1 : ������ ��
		else if (distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		// case 3-2 : ������ ��
		else if (distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		} else {
			return 2;
		}
	}

	// ��ȭ �ڵ�(������ 2���� ����� ���� ����(�׽�Ʈ �ڵ� ������ �ݷ� ����))
	// �Ǽ�Ÿ���� ������ϸ� ���������� �ȵ�
	// �����ϸ� ����Ÿ������ ���� ���ؾ� ��
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

		// �� ���� ���� ��ġ�� ���� ��
		if (xDis_pow == 0 && yDis_pow == 0) {
//			System.out.println("�� ���� ��ġ�� ����");
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

		// �� ���� �ٸ� ��ġ�� ���� ��(�߽����� �ٸ� �� �ۿ� ��ġ)
		if (distance_pow > (int) Math.pow(r1, 2) && distance_pow > (int) Math.pow(r2, 2)) {
//			System.out.println("�� ���� ��� �ٸ� �� �ۿ� ��ġ");
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

		// �� ���� �ٸ� ��ġ�� ���� ��(�߽����� �ٸ� �ٸ� �� �ȿ� ��ġ)
		if (distance_pow < (int) Math.pow(r1, 2) || distance_pow < (int) Math.pow(r2, 2)) {
//			System.out.println("�� ���� �ٸ� �� �ȿ� ��ġ");
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

		// �� ���� �ٸ� �� ���� ���� ��
		if (distance_pow == r1 || distance_pow == r2) {
//			System.out.println("�� ���� �ٸ� �� ���� ��ġ");
			result = 2;
		}
		return result;
	}
}

// �׽�Ʈ �ڵ�
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
				System.out.println("�Է°�: " + x1 + " " + y1 + " " + r1 + " " + x2 + " " + y2 + " " + r2);

				System.out.println("xDis_pow = " + xDis_pow);
				System.out.println("yDis_pow = " + yDis_pow);
				System.out.println("rDis_pow = " + rDis_pow);
				System.out.println("rDiff_pow = " + rDiff_pow);
				System.out.println("distance_pow = " + distance_pow);
				System.out.println("�����1: " + Math_1002.turret1(x1, y1, r1, x2, y2, r2));
				System.out.println("�����2: " + Math_1002.turret2(x1, y1, r1, x2, y2, r2));
				System.out.println();
				System.out.println("--------------------------------");
				break;
			}
		}
	}
}
