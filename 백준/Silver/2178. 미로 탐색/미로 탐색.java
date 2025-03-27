
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[][] map;
    static int N,M, count;
    static Queue<int[]> q;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1][M+1];
        map = new int[N][M];
        q = new LinkedList<>();
        count = 0;
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(int j=0;j<M;j++) {
                map[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 0)
                    visited[i][j] = true;
            }
        }
        visited[0][0] = true;
        bfs(0,0);
        System.out.println(map[N-1][M-1]);
    }

    static void bfs(int x, int y){
        visited[x][y] = true;
        q.offer(new int[]{x, y});
        while(!q.isEmpty()){
            int[] point = q.poll();
            int cx = point[0];
            int cy = point[1];
            for(int i=0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx <0 || ny <0 || nx >= N || ny >= M) continue;
                if(map[nx][ny] == 0) continue;
                if(visited[nx][ny]) continue;
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
                map[nx][ny] = map[cx][cy] + 1;
            }
        }
    }
}
