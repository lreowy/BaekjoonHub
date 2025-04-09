import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 세로
		m = Integer.parseInt(st.nextToken()); // 가로
		map = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[] start = new int[2];
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 2) {
					map[i][j] = 0;
					bfs(i, j);
					flag = true;
					start[0] = i;
					start[1] = j;
					break;
				}
			}
			if (flag)
				break;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 1)
					map[i][j] = -1;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == start[0] && j == start[1]) {
					map[i][j] = 0;
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if (nx < 0 || ny < 0 || nx >= n || ny >= m)
							continue;
						if (map[nx][ny] == 0)
							continue;
						map[nx][ny] = 1;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { i, j });
		visited[i][j] = true;
		map[i][j] = 0;

		while (!q.isEmpty()) {
			int[] c = q.poll();
			int cx = c[0];
			int cy = c[1];

			for (int k = 0; k < 4; k++) {
				int nx = cx + dx[k];
				int ny = cy + dy[k];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;
				if (visited[nx][ny] || map[nx][ny] != 1)
					continue;
				map[nx][ny] = map[cx][cy] + 1;
				visited[nx][ny] = true;
				q.add(new int[] { nx, ny });
			}
		}
	}

	static boolean canGo(int i, int j) {
		for (int k = 0; k < 4; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];
			if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
				continue;
			}
			if (map[nx][ny] != 0)
				return true;
		}
		return false;
	}
}
