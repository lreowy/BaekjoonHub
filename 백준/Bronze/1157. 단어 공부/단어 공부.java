import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        char[] string = s.toCharArray();
        int[] count = new int[27];
        for(char c : string){
            count[c-'a']++;
        }
        int max = 0;
        char alphabet = 'a';
        int check = 0;
        for(int i = 0; i < 26; i++){
            if(count[i] > max){
                max = count[i];
                alphabet = (char) ('A'+i);
            }
        }
        for(int i = 0; i < 26; i++){
            if(max == count[i])
                check++;
        }
        if(check > 1)
            System.out.println("?");
        else
            System.out.println(alphabet);
    }
}
