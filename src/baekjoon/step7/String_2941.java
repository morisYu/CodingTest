package baekjoon.step7;

// ũ�ξ�Ƽ�� ���ĺ�
// ũ�ξ�Ƽ�� ���ĺ��� ������ ���� ����

import java.util.Scanner;

public class String_2941 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		System.out.println("���ڿ� ����" + str.length());

		hasCroatia(str);

	}

	// ũ�ξ�Ƽ�� ���� ã�Ƽ� "0" ���� ġȯ
	static void hasCroatia(String str) {
		String[] croAlpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for (int i = 0; i < croAlpha.length; i++) {
			while (true) {
				if (str.indexOf(croAlpha[i]) >= 0) {
					System.out.println("Alpha: " + croAlpha[i] + " index: " + str.indexOf(croAlpha[i]));
					str = str.substring(0, str.indexOf(croAlpha[i]))+"0"
							+ str.substring(str.indexOf(croAlpha[i]) + croAlpha[i].length());
					System.out.println(croAlpha[i]+" ���� ��: "+str);
				} else {
					break;
				}
			}
		}
		System.out.println("str.length: " + str.length());
		System.out.println(str.length());
	}
	
	// ũ�ξ�Ƽ�� ���ڸ� �����ϸ鼭 ī��Ʈ �����ϰ� ���� ������ ������ ī��Ʈ�� ���ؼ� ���� �� ���
	// lljj �� ���� �߰��� "lj" �� �����ϸ鼭 ���� ���ڰ� �������鼭 �ٽ� "lj"�� ��������� ���� �߻�
	// ������ ���� ��ġ�� �ٸ� ���ڸ� �����ؼ� ���� �� ���ڼ��� ����ϵ��� ����
	
//	static int hasCroatiaFail(String str) {
//		String[] croAlpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
//		int count = 0;
//		for (int i = 0; i < croAlpha.length; i++) {
//			while (true) {
//				if (str.indexOf(croAlpha[i]) >= 0) {
//					System.out.println("Alpha: " + croAlpha[i] + " index: " + str.indexOf(croAlpha[i]));
//					count++;
//					str = str.substring(0, str.indexOf(croAlpha[i]))
//							+ str.substring(str.indexOf(croAlpha[i]) + croAlpha[i].length());
//					System.out.println(croAlpha[i]+" ���� ��: "+str);
//				} else {
//					break;
//				}
//			}
//		}
//		System.out.println("str.length: " + str.length());
//		System.out.println(count + str.length());
//		return count;
//	}
}
