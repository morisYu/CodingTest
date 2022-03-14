package baekjoon.step02;

// ¾Ë¶÷ ½Ã°è
// ½Ã°£ »¬¼À ¹®Á¦

import java.util.Scanner;

public class If_2884 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (M >= 45) {
			M -= 45;
		} else {
			if (H == 0) {
				H = 24;
			}
			H -= 1;
			M = M - 45 + 60;
		}
		System.out.println(H + " " + M);
	}
}
