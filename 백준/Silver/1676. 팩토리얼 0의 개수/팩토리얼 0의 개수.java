import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        BigInteger num = BigInteger.valueOf(1);
        for(int i=0;i<=N;i++) {
            if(i==0)
                num = num.multiply(BigInteger.valueOf(1));
            else
                num = num.multiply(BigInteger.valueOf(i));
        }
        int ans = 0;
        String s = num.toString();
        for(int i= s.length()-1;i>=0;i--){
            if(s.charAt(i) == '0') {
                ans++;
            } else
                break;
        }
        System.out.println(ans);
    }
}
