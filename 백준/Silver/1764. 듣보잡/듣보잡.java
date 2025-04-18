import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> listen = new HashSet<>();
        List<String> list = new ArrayList<>();

        int count = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            listen.add(word);
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            if(listen.contains(word)) {
                count++;
                list.add(word);
            }
        }

        Collections.sort(list);
        System.out.println(count);
        for(String s : list) {
            System.out.println(s);
        }


    }
}
