package baekjoon.step10;

// �Ǻ���ġ �� 5
// �Ǻ���ġ �� ���� �ܼ� for�����ε� ���� �� ������, �н��� ���� ��͸� �� ���ô�.

import java.util.Scanner;

public class Recursion_10870 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(fibonacci(n));
		
	}
	
	static int fibonacci(int n) {
		int result=0;
		if(n==0) {
			result = 0;
		}else if(n==1) {
			result = 1;
		}else {
			result = fibonacci(n-1)+fibonacci(n-2);
		}
		return result;
	}
}

// �׽�Ʈ�ڵ�
class testRecursion_10870{
	static void testCase() {
		int n = (int)(Math.random()*20);
		System.out.println("�Է°�: "+n);
		double t1 = System.nanoTime();
		System.out.println("�����: "+Recursion_10870.fibonacci(n));
		double t2 = System.nanoTime();
		System.out.println("����ð�: "+(t2-t1));
	
	}
}
