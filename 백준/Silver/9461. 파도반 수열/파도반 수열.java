import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            long[] dp = new long[101];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;
            dp[6] = 3;
            dp[7] = 4;
            dp[8] = 5;
            dp[9] = 7;
            dp[10] = 9;

            for(int j=1;j<=N;j++){
                if(j>10)
                    dp[j] = dp[j-2] + dp[j-3];
            }
            System.out.println(dp[N]);
        }
    }
}
