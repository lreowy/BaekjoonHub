import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int N, L, score, cal, maxScore;
	static int[][] ham;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int tc = 1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			
			ham = new int[N][2];
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<2;j++) {
					ham[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			maxScore = 0;
			cal = score = 0;
			recur(0,-1);
			System.out.println("#" + tc + " " + maxScore);
		}
	}
	
	public static void recur(int level, int lastIdx) {
		if(cal > L)
			return;
		maxScore = Math.max(maxScore, score);
		
		for(int i=lastIdx + 1; i<N; i++) {
			
			score += ham[i][0];
			cal += ham[i][1];
			
			recur(level + 1, i);
			
			score -= ham[i][0];
			cal -= ham[i][1];
		}
	}
}