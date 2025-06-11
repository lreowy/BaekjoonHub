import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char s[] = new char[13];

        String input = st.nextToken();

        for(int i=0;i<13;i++){
            s[i] = input.charAt(i);
        }

        int ans = 0;
        int sum = 0;
        int idx = 0;

        for(int i=0;i<13;i++){
            if(s[i] == '*')
                idx = i;
            else
                if(i % 2 == 0)
                    sum += Character.getNumericValue(s[i]);
                else
                    sum += Character.getNumericValue(s[i]) * 3;
        }

        for(int i=0;i<10;i++){
            int test = sum;
            if(idx % 2 == 0){
                test += i;
            }
            else
                test += 3 * i;
            if (test % 10 == 0) {
                System.out.print(i);
            }
        }


    }
}