import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        recur(0);
    }

    public static void recur(int idx){
        if(idx == M){
            boolean isValid = true;
            for(int i = 0; i < M-1; i++){
                if (result[i] > result[i + 1]) {
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                for (int i = 0; i < M; i++) {
                    System.out.print(result[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        for(int i = 1; i <= N; i++){
            result[idx] = i;
            recur(idx+1);
        }
    }
}
