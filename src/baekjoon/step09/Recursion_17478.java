package baekjoon.step09;

// ����Լ� �߰� ����

import java.util.Scanner;

public class Recursion_17478 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		sb.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.").append("\n");
		recursive(n, n);
		System.out.println(sb);
	}

	static void recursive(int n, int k) {

		if (n == 0) {
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("\"����Լ��� ������?\"").append("\n");
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"").append("\n");
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("��� �亯�Ͽ���.").append("\n");
			return;
		} else {
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("\"����Լ��� ������?\"").append("\n");
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.").append("\n");
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.").append("\n");
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"").append("\n");
			recursive(n - 1, k);
			for (int i = n; i < k; i++) {
				sb.append("____");
			}
			sb.append("��� �亯�Ͽ���.").append("\n");
		}
	}
}