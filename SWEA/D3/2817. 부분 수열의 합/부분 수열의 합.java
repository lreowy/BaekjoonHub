import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] arr;
	static int N, K, count;
	static boolean visit[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int tc = 1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			arr = new int[N];
			visit = new boolean[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			count = 0;
			powerset(0,0);
			
			System.out.println("#" + tc + " " + count);
		}
	}
	
	public static void powerset(int idx, int sum) {
		if(idx == N) {
			if(sum == K) {
				count++;
			}
			return;
		}
		
		powerset(idx + 1, sum);
		sum += arr[idx];
		powerset(idx+1, sum);
	}
}