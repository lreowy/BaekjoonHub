import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int tc = 1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			Queue<Integer> nq = new LinkedList<>();
			for(int i=1;i<=N;i++) {
				nq.add(i);
			}
			Queue<Integer> mq = new LinkedList<>();
			for(int i=1;i<=M;i++) {
				mq.add(i);
			}
			
			int count[] = new int[N+M+1];
			
			while(!nq.isEmpty()) {
				int p = nq.poll();
				for(int q : mq) {
					count[p+q]++;
				}
			}
			
			int max = 0;
			for(int i=0;i<count.length;i++) {
				if(count[i] >= max) {
					max = count[i];
				}
			}
			
			System.out.print("#" + tc + " ");
			for(int i=0;i<count.length;i++) {
				if(count[i] == max)
					System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
}
