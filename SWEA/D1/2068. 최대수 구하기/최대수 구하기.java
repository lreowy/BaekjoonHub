import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int tc = 1; tc<= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int max = 0;
			for(int i=0;i<10;i++) {
				int a = Integer.parseInt(st.nextToken());
				if(max < a)
					max = a;
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}