import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i=0;i<=N;i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[N+1];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int result = 0;
        for(int i=1;i<=N;i++){
            if(visited[i]){
                continue;
            }
            bfs(i);
            result++;
        }
        System.out.println(result);
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()){
            int node = q.poll();
            for(int i=0;i<graph.get(node).size();i++){
                if(visited[graph.get(node).get(i)]){
                    continue;
                }
                visited[graph.get(node).get(i)] = true;
                q.add(graph.get(node).get(i));
            }
        }
    }
}
