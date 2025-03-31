import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int big = 0;
		int small = 0;
		if(a > b) {
			big = a;
			small = b;
		}
		else {
			big = b;
			small = a;
		}
		int max = 0;
		for(int i=1;i<=small; i++) {
			if(big % i == 0 && small % i == 0) {
				max = i;
			}
		}
		
		int min = max * (big / max) * (small / max);
		
		System.out.println(max);
		System.out.println(min);
	}
}