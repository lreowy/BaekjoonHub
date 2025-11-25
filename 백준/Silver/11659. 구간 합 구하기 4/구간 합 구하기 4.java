import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] sum = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i==0)
                sum[i] = arr[i];
            else
                sum[i] = sum[i-1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int k=0;k<M;k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if(i==1)
                sb.append(sum[j-1] + "\n");
            else
                sb.append(sum[j-1] - sum[i-2] + "\n");
        }

        System.out.println(sb);

    }
}
