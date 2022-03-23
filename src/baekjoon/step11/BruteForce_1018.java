package baekjoon.step11;

// ü���� �ٽ� ĥ�ϱ�
// ü������ ����� ��� ��츦 �õ��Ͽ� ������ ����� ã�� ����

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BruteForce_1018 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static String str;

	public static void main(String[] args) throws IOException {

//		str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str);
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//
//		System.out.println(chess(N, M));
		
		testBruteForce_1018.testCase();
	}

	// �־��� �ǿ��� �������� �ٲٸ� 8*8 ü������ �����ϰ�
	// ������� �����ϴ� ü���ǰ� ���������� �����ϴ� ü������ ���Ͽ�
	// �ٸ� �κ��� ī��Ʈ�� ������Ŵ
	static int chess(int N, int M) throws IOException {
		boolean[][] tmp = readChess(N, M);
		int x = M - 8;
		int y = N - 8;
		int result = Integer.MAX_VALUE;

		for (int i = 0; i <= y; i++) {
			for (int j = 0; j <= x; j++) {
				int count = 0;
				for (int l = 0; l < 8; l++) {
					for (int m = 0; m < 8; m++) {
						if (tmp[i + l][j + m] != white()[l][m]) {
							count++;
						}
					}
				}
				if (result > count) {
					result = count;
				}
//				System.out.println("white ī��Ʈ: " + count + " ���: " + result);
				
				count = 0;
				for (int l = 0; l < 8; l++) {
					for (int m = 0; m < 8; m++) {
						if (tmp[i + l][j + m] != black()[l][m]) {
							count++;
						}
					}
				}
				if (result > count) {
					result = count;
				}
//				System.out.println("black ī��Ʈ: " + count + " ���: " + result);
				
			}
		}
		return result;
	}

	// �־��� ���� �о boolean Ÿ������ ��ǥ ����
	static boolean[][] readChess(int N, int M) throws IOException {
		boolean[][] result = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			str = br.readLine();
			char[] ch = str.toCharArray();
			for (int j = 0; j < M; j++) {
				if (ch[j] == 'W') {
					result[i][j] = true;
				} else {
					result[i][j] = false;
				}
			}
		}
		return result;
	}

	// (0,0)�� ������� �����ϴ� ü���� ����
	static boolean[][] white() {
		boolean[][] result = new boolean[8][8];

		for (int i = 0; i < 8; i++) {
			if (i == 0) {
				result[0][0] = true;
			} else {
				result[i][0] = !result[i - 1][0];
			}
			for (int j = 1; j < 8; j++) {
				result[i][j] = !result[i][j - 1];
			}
		}
		return result;
	}

	// (0,0)�� ���������� �����ϴ� ü���� ����
	static boolean[][] black() {
		boolean[][] result = new boolean[8][8];

		for (int i = 0; i < 8; i++) {
			if (i == 0) {
				result[0][0] = false;
			} else {
				result[i][0] = !result[i - 1][0];
			}
			for (int j = 1; j < 8; j++) {
				result[i][j] = !result[i][j - 1];
			}
		}
		return result;
	}
}

class testBruteForce_1018{
	
	static StringBuilder sb = new StringBuilder();
	
	static void testCase() {
		int N = (int)(Math.random()*42)+8;
		int M = (int)(Math.random()*42)+8;
		
		sb.append("�Է°�\n"+N+" "+M+"\n");
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				int x = (int)(Math.random()*10);
				if(x<=5) {
					sb.append("B");
				}else {
					sb.append("W");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
