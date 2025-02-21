import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] heap;
	static int heapSize;

	public static void heapPush(int item) {
		heap[++heapSize] = item;

		int ch = heapSize;
		int p = ch / 2;

		while (p > 0 && heap[p] < heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;

			ch = p;
			p = ch / 2;
		}
	}

	public static int heapPop() {
		if (heapSize == 0) {
			return -1;
		}

		int item = heap[1];

		heap[1] = heap[heapSize--];
		int p = 1;
		int ch = p * 2;

		if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1])
			ch += 1;

		while (ch <= heapSize && heap[p] < heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;

			p = ch;
			ch = p * 2;
			if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1])
				ch += 1;
		}
		return item;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;


		for (int tc = 1; tc <= T; tc++) {
			
			heap = new int[1000000];
			heapSize = 0;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			System.out.print("#" + tc + " ");
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int info = Integer.parseInt(st.nextToken());
				if (info == 1) {
					int item = Integer.parseInt(st.nextToken());
					heapPush(item);
				} else if (info == 2) {
					System.out.print(heapPop() + " ");
				}
			}
			System.out.println();
		}

	}
}
