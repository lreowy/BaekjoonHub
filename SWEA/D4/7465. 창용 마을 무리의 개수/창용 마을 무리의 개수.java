
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static int[] p;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int tc = 1 ;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] arr = new int[N+1];
			p = new int[N+1];
			
			for(int i=1;i<=N;i++) {
				p[i] = i;
			}
			
			for(int i=0;i<M;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				union(a, b);
			}
			
			for(int i=1;i<=N;i++) {
				arr[i] = findSet(p[i]);
			}
			
			Arrays.sort(arr);
			
			int count = 0;
			int test = arr[0];
			for(int j=1;j<=N;j++) {
				if(test != arr[j]) {
					test = arr[j];
					count++;
				}
					
			}
			System.out.println("#" + tc +" " + count);
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
}
