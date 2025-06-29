import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("add"))
                set.add(Integer.parseInt(st.nextToken()));
            else if(s.equals("remove")){
                int x = Integer.parseInt(st.nextToken());
                if(set.contains(x))
                    set.remove(x);
            }
            else if(s.equals("check")) {
                if (set.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
            else if(s.equals("toggle")){
                int x = Integer.parseInt(st.nextToken());
                if(set.contains(x)) {
                    set.remove(x);
                } else
                    set.add(x);
            }
            else if(s.equals("all")){
                set.clear();
                for(int j=1;j<=20;j++){
                    set.add(j);
                }
            } else if(s.equals("empty"))
                set.clear();
        }
        System.out.println(sb.toString());
    }
}
