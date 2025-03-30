import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static int[] dx = {1,0,-1,0,1,1,-1,-1};
    static int[] dy = {0,1,0,-1,-1,1,1,-1};
    static boolean[][] visited;
    static int N;
    static char[][] map;
    static int[][] mine;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int tc = 1;tc<=T;tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            map = new char[N][N];
            visited = new boolean[N][N];
            mine = new int[N][N];
            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = s.charAt(j);
                    if (map[i][j] == '*') {
                        mine[i][j] = -1;
                    } else {
                        mine[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == '*') {
                        continue;
                    }
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                            continue;
                        }
                        if (map[nx][ny] == '*') {
                            mine[i][j] += 1;
                        }
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j] == '*' || visited[i][j]) {
                        continue;
                    }
                    if(mine[i][j] == 0) {
                        ans++;
                        bfs(i,j);
                    }
                }
            }

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(!visited[i][j] && map[i][j] != '*') {
                        ans++;
                    }
                }
            }

            System.out.println("#" + tc + " " + ans);
        }
    }
    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int cx = point[0];
            int cy = point[1];

            for(int i=0;i<8;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx <0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }
                if(visited[nx][ny] || map[nx][ny] == '*'){
                    continue;
                }
                visited[nx][ny] = true;
                if(mine[nx][ny] == 0){
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
