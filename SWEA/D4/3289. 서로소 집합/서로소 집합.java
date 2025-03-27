
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] p;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int tc = 1; tc<=T; tc++) {
			StringBuilder sb = new StringBuilder();
			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			p = new int[n+1];
			for(int i=1;i<=n;i++) {
				p[i] = i; //자기 자신이 parent
			}
			for(int i=0;i<m;i++) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				if(c == 0) {
					union(a, b);
				} else if(c == 1) {
					if(findSet(a) == findSet(b))
						sb.append(1);
					else {
						sb.append(0);
					}
				}
			}
			System.out.println(sb);
		}
	}
	
	static void union(int x, int y) {
		int a = findSet(x);
		int b = findSet(y);
		p[b] = a;
	}
	
	static int findSet(int x) {
		if(x != p[x])
			p[x] = findSet(p[x]);
		return p[x];
	}
	
	static void makeSet(int x) {
		p[x] = x;
	}
}
