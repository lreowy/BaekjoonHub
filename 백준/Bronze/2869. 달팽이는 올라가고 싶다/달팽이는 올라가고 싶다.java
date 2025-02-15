import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long v = Integer.parseInt(st.nextToken());

        long dest = v-b;
        long dist = a-b;

        if(dest % dist != 0)
            System.out.println(dest/dist + 1);
        else
            System.out.println(dest/dist);
    }
}
