package baekjoon.step09;

// ���丮��
// ���丮���� �ܼ� for�����ε� ���� �� ������, �н��� ���� ��͸� �� ���ô�.

import java.util.Scanner;

public class Recursion_10872 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(factorial(n));
		
		testRecursion_10872.testCase();
	}

	// ����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ�
	// for �� ���� ����ӵ��� �������� �������� ����, ���� ����� ���� �� ���� 
	static int factorial(int n) {
		int result;
		if (n == 0) {
			result = 1;
		} else if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		}

		return result;
	}
}

// �׽�Ʈ �ڵ�
class testRecursion_10872 {
	static void testCase() {
		int n = (int) (Math.random() * 12);
		int result = 1;
		System.out.println("�Է°�: "+n);
		
		double t1 = System.nanoTime();
		Recursion_10872.factorial(n);
		double t2 = System.nanoTime();
		System.out.println("��� �ð�: " + (t2 - t1));
		System.out.println("���: "+Recursion_10872.factorial(n));

		double t3 = System.nanoTime();
		if (n == 0 || n==1) {
			Recursion_10872.factorial(n);
		}else {
			for(int i=1;i<=n;i++) {
				result*=i;
			}
		}
		double t4 = System.nanoTime();
		System.out.println("for�� �ð�: " + (t4 - t3));
		System.out.println("���: "+result);

	}
}
