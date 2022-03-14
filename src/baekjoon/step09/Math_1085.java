package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���簢������ Ż��
// ���簢���� ���� �Ÿ��� ���ϴ� ����
// ���� ���� ��ġ���� ���簢�� ��輱���� ���� �ּҰ��� ���ϱ�

public class Math_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strBr = br.readLine();
		String[] strArray = strBr.split(" ");
		int x = Integer.parseInt(strArray[0]);
		int y = Integer.parseInt(strArray[1]);
		int w = Integer.parseInt(strArray[2]);
		int h = Integer.parseInt(strArray[3]);

//		System.out.println("(" + x + ", " + y + ")");
//		System.out.println("(" + w + ", " + h + ")");

		System.out.println(rectDistance(x, y, w, h));
		
		
//		testMath_1085.testCase();
	}

	static int rectDistance(int x, int y, int w, int h) {
		int result = 0;
		int dx = 0;
		int dy = 0;

		if ((x - 0) < (w - x)) {
			dx = x - 0;
		} else {
			dx = w - x;
		}

		if ((y - 0) < (h - y)) {
			dy = y - 0;
		} else {
			dy = h - y;
		}

		if (dx < dy) {
			result = dx;
		} else {
			result = dy;
		}

		return result;
	}
}

// �׽�Ʈ�ڵ�
class testMath_1085 {
	static void testCase() {
		int x;
		int y;
		int w;
		int h;
		while (true) {
			x = (int) (Math.random() * 10) + 1;
			y = (int) (Math.random() * 10) + 1;
			w = (int) (Math.random() * 10) + 1;
			h = (int) (Math.random() * 10) + 1;

			if (x < w && y < h) {
				break;
			}
		}
		System.out.println("�Է°�");
		System.out.println("(x=" + x + ", y=" + y + ")");
		System.out.println("(w=" + w + ", h=" + h + ")");
		
		System.out.println("�ּҰŸ�: " + Math_1085.rectDistance(x, y, w, h));
	}
}