import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] result;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		result = new int[M];
		visited = new boolean[N + 1];
		
		perm(0);
	}

	public static void perm(int idx) {
		boolean isValid = true;
		if (idx == M) {
			for (int i = 0; i < M - 1; i++) {
				if (result[i] > result[i + 1])
					isValid = false;
			}
			if (isValid) {
				for (int i = 0; i < M; i++) {
					System.out.print(result[i] + " ");
				}
				System.out.println();
			}
			return;
		}
		
		for(int i=1;i<=N;i++) {
			if(visited[i])
				continue;
			result[idx] = i;
			visited[i] = true;
			perm(idx + 1);
			visited[i] = false;
		}
	}
}