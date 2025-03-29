
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    static List<ArrayList<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int tc = 1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            graph = new ArrayList<>();
            visited = new boolean[N + 1];

            for(int i=0;i<=N;i++){
                graph.add(new ArrayList<>());
            }

            for (int i = 1; i <= M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            for(int node : graph.get(1)) {
                visited[node] = true;
                for(int idx : graph.get(node)) {
                    visited[idx] = true;
                }
            }
            visited[1] = false;
            int count = 0;
            for(int i=1;i<=N;i++){
                if(visited[i]){
                    count++;
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}
