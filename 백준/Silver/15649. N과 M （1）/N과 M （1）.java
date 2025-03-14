import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static boolean[] visited;
	static int[] result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		result = new int[M];
		visited = new boolean[N+1];
		
		recur(0);
	}
	
	public static void recur(int level) {
		if(level == M) {
			for(int i=0;i<M;i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<=N;i++) {
			if(visited[i])
				continue;
			result[level] = i;
			visited[i] = true;
			recur(level + 1);
			visited[i] = false;
		}
	}
}