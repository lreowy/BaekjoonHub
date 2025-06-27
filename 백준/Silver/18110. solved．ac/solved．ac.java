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
        int[] op = new int[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            op[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(op);

        int percent = (int) Math.round(op.length * 0.15);
        int avg = 0;
        int sum = 0;
        for(int i=percent;i<N-percent;i++){
            sum += op[i];
        }

        avg = (int) Math.round((double) sum / (N-percent*2));
        System.out.println(avg);
    }
}
