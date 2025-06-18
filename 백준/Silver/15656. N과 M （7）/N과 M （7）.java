import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] result, list;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];
        list = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);
        recur(0);
        System.out.print(sb.toString());
    }

    static void recur(int idx){
        if(idx == M) {
            for(int i = 0; i < M; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<N;i++){
            result[idx] = list[i];
            recur(idx+1);
        }
    }
}
