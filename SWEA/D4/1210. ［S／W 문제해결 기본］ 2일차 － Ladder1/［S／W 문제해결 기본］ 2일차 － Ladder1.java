import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int tc=1;tc<=10;tc++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[][] arr = new int[100][100];
            //시작 좌표
            int x = 0;
            int y = 99;
            //원소 삽입
            for(int i=0; i<100;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if(arr[i][j]==2){
                        x = j;
                    }
                }
            }

            for(; y>=0; y--){
                //왼쪽이 1일때
                if(x-1 >= 0 && arr[y][x-1] == 1) {
                    while(x-1 >= 0 && arr[y][x-1] == 1)
                        x--;
                }
                else if(x+1 < 100 && arr[y][x+1] == 1){
                    while(x+1 <100 && arr[y][x+1] == 1)
                        x++;
                }
            }
            System.out.println("#" + tc +" " + x);
        }
    }
}