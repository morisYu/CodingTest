package baekjoon.step8;

// ACM ȣ��
// ȣ�� �� ��ȣ�� ��Ģ�� ã�� ����ϴ� ����

import java.util.Scanner;

public class Math_10250 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			int N = scanner.nextInt();
			System.out.println(hotel(H, W, N));
		}

//		testMath_10250.testCase();
	}

	// �ݺ��� ���
	// �ҿ�ð�(272 ms)
	static int hotel(int H, int W, int N) {
		int roomNo = 0;
		int column = 1;
		int raw = 0;
		while (true) {
			if ((N - (column - 1) * H) > H) {
				column++;
			} else {
				raw = (N - (column - 2) * H) - H;
				String w = Integer.toString(raw);
				String h = Integer.toString(column);
				if (h.length() == 1) {
					h = "0" + h;
				}
				String room = w + h;
				roomNo = Integer.parseInt(room);
				break;
			}
		}
		return roomNo;
	}

	// �ݺ��� �̻��
	// �ҿ�ð�(292 ms)
	static int hotel2(int H, int W, int N) {
		int roomNo = 0;
		int column = 1;
		int raw = 0;

		raw = N % H;
		if (raw == 0) {
			column = N / H;
			raw = H;
		} else {
			column = N / H + 1;
		}

		String w = Integer.toString(raw);
		String h = Integer.toString(column);

		if (h.length() == 1) {
			h = "0" + h;
		}

		String room = w + h;
		roomNo = Integer.parseInt(room);

		return roomNo;
	}
}

// �׽�Ʈ�ڵ�
class testMath_10250 {
	static void testCase() {
		int T = (int) (Math.random() * 5 + 1);
		int H;
		int W;
		int N;

		System.out.println("����� ��: " + T);
		for (int i = 0; i < T; i++) {

			while (true) {
				H = (int) (Math.random() * 20 + 1);
				W = (int) (Math.random() * 20 + 1);
				N = (int) (Math.random() * 20 + 1);
				if (N <= H * W) {
					break;
				}
			}
			System.out.println("H-" + H + " W-" + W + " N-" + N);
			System.out.println(Math_10250.hotel2(H, W, N));

		}
	}
}
