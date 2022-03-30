package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_10250_buffer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			sb.append(hotel(H, W, N)).append('\n');
		}
		System.out.print(sb);

	}

	// 반복문 사용
	// 소요시간(144 ms)
	static int hotel(int H, int W, int N) {
		int roomNo = 0;
		int column = 1;
		int raw = 0;
		while (true) {
			if ((N - (column - 1) * H) > H) {
				column++;
			} else {
				raw = (N - (column - 2) * H) - H;
				String w = Integer.toString(raw);
				String h = Integer.toString(column);
				if (h.length() == 1) {
					h = "0" + h;
				}
				String room = w + h;
				roomNo = Integer.parseInt(room);
				break;
			}
		}
		return roomNo;
	}

	// 반복문 미사용
	// 소요시간(140 ms)
	static int hotel2(int H, int W, int N) {
		int roomNo = 0;
		int column = 1;
		int raw = 0;

		raw = N % H;
		if (raw == 0) {
			column = N / H;
			raw = H;
		} else {
			column = N / H + 1;
		}

		String w = Integer.toString(raw);
		String h = Integer.toString(column);

		if (h.length() == 1) {
			h = "0" + h;
		}

		String room = w + h;
		roomNo = Integer.parseInt(room);

		return roomNo;
	}
}
