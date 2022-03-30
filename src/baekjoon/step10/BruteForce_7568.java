package baekjoon.step10;

// 덩치
// 모든 사람을 비교하여 덩치 등수를 구하는 문제
// 몸무게와 키가 모두 상대방보다 클 경우 등수가 높음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BruteForce_7568 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static StringBuilder sb = new StringBuilder();
	public static String str;
	
	public static void main(String[] args) throws IOException {

		int N = 0;
		int[][] size;
		
		str = br.readLine();
		N = Integer.parseInt(str);

		size = new int[N][2];

		for (int i = 0; i < N; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			for (int j = 0; j < 2; j++) {
				size[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sizeRank(N, size);
		
//		TestBruteForce_7568.testCase();

	}
	
	static void sizeRank(int N, int[][] size) {
		int[] rank;
		rank = new int[N];

		for (int i = 0; i < N; i++) {
			rank[i] = 1;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (i < N - 1) {
				sb.append(rank[i] + " ");
			} else {
				sb.append(rank[i]);
			}
		}
		System.out.println(sb);
	}
}

// 테스트코드
class TestBruteForce_7568{
	static void testCase() {
		int N = (int) (Math.random()*50)+2;
		int[][] size = new int[N][2];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				size[i][j] = (int) (Math.random()*100)+10;
			}
		}
		System.out.println("입력값: "+N);
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(size[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("결과값");
		
		BruteForce_7568.sizeRank(N, size);
	}
}











