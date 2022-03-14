package baekjoon.step08;

// �����̴� �ö󰡰� �ʹ�
// �������� �������� ����ϴ� ����

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
	
	// ����Ǵ� ������ �� �����ؾ���. (�ö󰡴� �ϼ�, �������� �ϼ� ���� ����)
	// �ð� �ʰ�(�ݺ��� ��� �ϸ� �ȵ�)
	// scanner ���� Buffer�� �ð��� �ξ� ����
	// �޼ҵ带 ���� ����°��ϰ� main �޼ҵ忡 �ۼ��ϴ°Ŵ� �ӵ����� ����
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

// �׽�Ʈ �ڵ�
class testMath_2869{
	
	private int A = (int) (Math.random() * 20 + 10);
	private int B = (int) (Math.random() * 11 + 1);
	private int V = (int) (Math.random() * 40 + 15);
	
	void testCase() {
		double startTime = System.currentTimeMillis();

		System.out.println("�Է°�: " + A+" , "+B+" , "+V);
		System.out.println("�����: "+Math_2869.climb(A, B, V));
		
		double endTime = System.currentTimeMillis();
		double testTime = (endTime - startTime+350) / 1000;
		System.out.println("�׽�Ʈ�ð�: " + testTime + " ��");
	}
}