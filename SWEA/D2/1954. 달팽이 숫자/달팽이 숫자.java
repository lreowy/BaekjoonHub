import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    //우, 하, 좌, 상
    static int dr[] = {0, 1, 0, -1};
    static int dc[] = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for(int tc = 1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];

            int num = 1;
            int row = 0;
            int col = 0;
            int d = 0;

            while(num <= N * N){
                arr[row][col] = num++;
                int nr = row + dr[d];
                int nc = col + dc[d];

                if(!(nr >= 0 && nr < N && nc >= 0 && nc < N) || arr[nr][nc] > 0){
                    d = (d+1) % 4;
                    nr = row + dr[d];
                    nc = col + dc[d];
                }

                row = nr;
                col = nc;
            }
            System.out.println("#" + tc + " ");
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
