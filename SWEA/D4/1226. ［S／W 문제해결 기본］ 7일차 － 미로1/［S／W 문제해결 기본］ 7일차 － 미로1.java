import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc = 1;tc<=10;tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int test = Integer.parseInt(st.nextToken());
            int startX = 0;
            int startY = 0;
            map = new int[16][16];
            for(int i=0;i<16;i++){
                st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                for(int j=0;j<16;j++){
                    map[i][j] = Character.getNumericValue(s.charAt(j));
                    if(map[i][j]==2){
                        startX=i;
                        startY=j;
                    }
                }
            }
            visited = new boolean[16][16];
            System.out.println("#" + test + " " + bfs(startX, startY));
        }
    }
    static int bfs(int startX, int startY){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        boolean flag = false;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            visited[x][y] = true;
            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= 16 || ny >= 16){
                    continue;
                }
                if(visited[nx][ny] || map[nx][ny]==1){
                    continue;
                }
                if(map[nx][ny]==3){
                    flag = true;
                }
                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});
            }
        }
        if(flag){
            return 1;
        }
        return 0;
    }
}
