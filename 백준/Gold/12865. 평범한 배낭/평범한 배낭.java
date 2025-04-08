import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static Integer[][] dp;
	static int[] w;
	static int[] v;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		w = new int[N];
		v = new int[N];
		dp = new Integer[N][K+1];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(knapsack(N-1, K));
	}
	static int knapsack(int i, int k) {
		if(i<0)
			return 0;
		if(dp[i][k] == null) {
			if(w[i] > k) {
				dp[i][k] = knapsack(i-1, k);
			} else {
				dp[i][k] = Math.max(knapsack(i-1, k), knapsack(i-1, k-w[i]) + v[i]);
			}
		}
		
		return dp[i][k];
	}
}
