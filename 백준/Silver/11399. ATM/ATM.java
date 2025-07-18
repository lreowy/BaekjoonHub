import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] p = new int[N];
        for(int i=0;i<N;i++){
            p[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);
        int sum = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                sum += p[j];
            }
        }

        System.out.println(sum);
    }
}
