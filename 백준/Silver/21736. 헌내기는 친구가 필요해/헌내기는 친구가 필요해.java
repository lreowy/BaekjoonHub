import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, count;
    static char[][] campus;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new char[N][M];
        visited = new boolean[N][M];
        count = 0;

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < M; j++) {
                campus[i][j] = s.charAt(j);
                if(campus[i][j] == 'I')
                    queue.add(new int[]{i, j});
            }
        }

        bfs();
        if(count == 0)
            System.out.println("TT");
        else
            System.out.println(count);
    }

    static void bfs(){
        int[] now = queue.peek();
        int x = now[0];
        int y = now[1];
        visited[x][y] = true;

        while(!queue.isEmpty()){
            int[] c = queue.poll();
            int cx = c[0];
            int cy = c[1];
            visited[cx][cy] = true;

            for(int i=0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(visited[nx][ny] || campus[nx][ny] == 'X') continue;
                if(campus[nx][ny] == 'P')
                    count++;
                visited[nx][ny] = true;
                queue.add(new int[]{nx, ny});
            }
        }
    }
}
