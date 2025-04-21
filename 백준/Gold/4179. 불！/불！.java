import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int R, C, jihunX, jihunY;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] jihunRoute, fireRoute;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        jihunRoute = new int[R][C];
        fireRoute = new int[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
                fireRoute[i][j] = -1;  // 초기값 -1: 불이 도달하지 않은 칸
                if (map[i][j] == 'J') {
                    jihunX = i;
                    jihunY = j;
                }
            }
        }

        fire(); // 모든 불 위치에서 시작
        jihun(); // 지훈이 탈출 시도
    }

    static void jihun() {
        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[R][C];
        q.add(new int[]{jihunX, jihunY});
        visited[jihunX][jihunY] = true;
        jihunRoute[jihunX][jihunY] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            // 가장자리면 탈출 성공
            if (cx == 0 || cx == R - 1 || cy == 0 || cy == C - 1) {
                System.out.println(jihunRoute[cx][cy] + 1);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (!onMap(nx, ny)) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == '#') continue;

                // 불이 이미 도달했고, 지훈이보다 먼저 또는 동시에 도착하면 안 됨
                if (fireRoute[nx][ny] != -1 && jihunRoute[cx][cy] + 1 >= fireRoute[nx][ny])
                    continue;

                visited[nx][ny] = true;
                jihunRoute[nx][ny] = jihunRoute[cx][cy] + 1;
                q.add(new int[]{nx, ny});
            }
        }

        System.out.println("IMPOSSIBLE");
    }

    static void fire() {
        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'F') {
                    q.add(new int[]{i, j});
                    fireRoute[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (!onMap(nx, ny)) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == '#') continue;

                visited[nx][ny] = true;
                fireRoute[nx][ny] = fireRoute[cx][cy] + 1;
                q.add(new int[]{nx, ny});
            }
        }
    }

    static boolean onMap(int x, int y) {
        return x >= 0 && y >= 0 && x < R && y < C;
    }
}
