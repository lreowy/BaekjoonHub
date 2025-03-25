
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;
	static int N,M,V;
 	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<>();
		visited = new boolean[N+1];
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
		
		dfs(V);
		System.out.println();
		visited = new boolean[N+1];
		bfs(V);
	}
	
	static void dfs(int v) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int i : graph.get(v)) {
			if(!visited[i]) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visited[v] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur + " ");
			for(int next : graph.get(cur)) {
				if(!visited[next]) {
					visited[next] = true;
					q.add(next);
				}
			}
		}
	}
}
