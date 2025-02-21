import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int tc = 1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			double scores[] = new double[N];
			double target = 0;
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				int mid = Integer.parseInt(st.nextToken());
				int fin = Integer.parseInt(st.nextToken());
				int assign = Integer.parseInt(st.nextToken());
				
				double score = mid * 0.35 + fin * 0.45 + assign * 0.2;
				scores[i] = score;
				
				if(i+1 == K) {
					target = score;
				}
				
			}
			Arrays.sort(scores); 
			
			String[] grade = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
			
			for(int i=0;i<N;i++) {
				if(scores[i] == target)
					System.out.println("#" + tc + " " + grade[i/(N/10)]);
			}
		}
	}
}
