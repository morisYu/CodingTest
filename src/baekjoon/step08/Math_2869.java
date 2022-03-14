package baekjoon.step08;

// 달팽이는 올라가고 싶다
// 달팽이의 움직임을 계산하는 문제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_2869 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		System.out.println(climb(up,down,length));
		
//		testMath_2869 test = new testMath_2869();
//		test.testCase();
		
	}
	
	// 연산되는 순서를 잘 생각해야함. (올라가는 일수, 내려오는 일수 따로 생각)
	// 시간 초과(반복문 사용 하면 안됨)
	// scanner 보다 Buffer가 시간이 훨씬 빠름
	// 메소드를 따로 만드는거하고 main 메소드에 작성하는거는 속도차이 없음
	static int climb(int A, int B, int V) {
		
		int day=1;

		
		day=(V-B)/(A-B);
		
		if((V-B)%(A-B)!=0) {
			day++;
		}

//		int tmp=A;
//		int up;
//		int down;
//		while(true) {
//			if(tmp>=V) {
//				break;
//			}else {
//				tmp=tmp-B+A;
//				day++;
//			}
//		}
		return day;
	}
}

// 테스트 코드
class testMath_2869{
	
	private int A = (int) (Math.random() * 20 + 10);
	private int B = (int) (Math.random() * 11 + 1);
	private int V = (int) (Math.random() * 40 + 15);
	
	void testCase() {
		double startTime = System.currentTimeMillis();

		System.out.println("입력값: " + A+" , "+B+" , "+V);
		System.out.println("결과값: "+Math_2869.climb(A, B, V));
		
		double endTime = System.currentTimeMillis();
		double testTime = (endTime - startTime+350) / 1000;
		System.out.println("테스트시간: " + testTime + " 초");
	}
}