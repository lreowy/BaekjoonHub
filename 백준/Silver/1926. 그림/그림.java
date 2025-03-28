import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n,m, count, size;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1 , 0, -1};
	static Queue<int[]> q;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int[][] paper = new int[n][m];
		visited = new boolean[n][m];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j =0;j<m;j++) {
				if(paper[i][j] == 0)
					visited[i][j] = true;
			}
		}
		count = 0;
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(!visited[i][j]) {
					count++;
					size = 0;
					bfs(i,j);
					if(max <= size) {
						max = size;
					}
				}
			}
		}
		System.out.println(count + "\n" + max);
	}
	
	static void bfs(int x, int y) {
		q = new LinkedList<>();
		q.add(new int[] {x,y});
		visited[x][y] = true;
		size++;
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];
			
			for(int i=0;i<4;i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if(nx <0 || nx >=n || ny <0 || ny >=m)
					continue;
				if(visited[nx][ny])
					continue;
				visited[nx][ny] = true;
				q.add(new int[] {nx, ny});
				size++;
			}
		}
	}
}
