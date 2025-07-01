import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i=0;i<N;i++) {
            String number = String.valueOf(N-i);
            int sum = Integer.parseInt(number);
            for(int j=0;j<number.length();j++) {
                sum += Character.getNumericValue(number.charAt(j));
            }
            if(sum==N) {
                ans = N-i;
            }
        }
        System.out.println(ans);
    }
}
