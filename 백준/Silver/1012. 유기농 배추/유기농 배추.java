import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static boolean visited[][];
	static int[][] map;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int tc =0; tc<T; tc++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			visited = new boolean[N][M];
			int K = Integer.parseInt(st.nextToken());
			
			for(int i =0; i<K;i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x] = 1;
			}
			for(int a = 0;a<N;a++) {
				for(int b= 0;b<M;b++) {
					if(map[a][b] == 0)
						visited[a][b] = true;
				}
			}
			int ans = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(!visited[i][j]) {
						bfs(i, j);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		visited[i][j] = true;
		q.add(new int[] {i,j});
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];
			
			for(int k=0;k<4;k++) {
				int nx = cx + dx[k];
				int ny = cy + dy[k];
				
				if(nx < 0 || ny < 0 || nx >= N|| ny >= M)
					continue;
				if(visited[nx][ny] || map[nx][ny] == 0)
					continue;
				visited[nx][ny] = true;
				q.add(new int[] {nx, ny});
			}
		}
	}
}
