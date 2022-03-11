package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 직각삼각형
// 피타고라스의 정리에 대해 배우는 문제
// 주어진 세 변의 길이로 직각삼각형인지 아닌지 구분

public class Math_4153 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str;
//		int[] distance = new int[3];
//		while(true) {
//			
//			str = br.readLine();
//			for(int i=0;i<distance.length;i++) {
//				distance[i]=Integer.parseInt(str.split(" ")[i]);
//			}
//			
//			if(distance[0]==0 || distance[1]==0 || distance[2]==0) {
//				return;
//			}
//			pythagorean(distance);
//		}
		testMath_4153.testCase();
	}
	
	static void pythagorean(int[] distance) {
		Arrays.sort(distance);
		
		for(int i : distance) {
			System.out.println(i);
		}
		if(Math.pow(distance[2], 2)==(Math.pow(distance[0], 2)+Math.pow(distance[1], 2))) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}
}

class testMath_4153{
	static void testCase() {
		
		System.out.println("입력값");
		while(true) {
			int[] distance = new int[3];
			for(int i=0;i<3;i++) {
				distance[i]=(int)(Math.random()*100);
				System.out.print(i+" ");
			}
			System.out.println();
			
//			if(distance[0]==0 || distance[1]==0 || distance[2]==0) {
//				System.out.println("0이 입력됨");
//				return;
//			}
			
			Math_4153.pythagorean(distance);
		}
	}
}
