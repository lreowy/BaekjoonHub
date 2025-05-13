import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[] check = new boolean[31];

        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            check[a] = true;
        }

        for (int i = 1; i < 31; i++) {
            if(!check[i]) {
                System.out.println(i);
            }
        }
    }
}