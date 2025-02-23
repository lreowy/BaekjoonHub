import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int a = Integer.parseInt(String.valueOf(c));
            sum += a;
        }

        System.out.println(sum);
    }
}
