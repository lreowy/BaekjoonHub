import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		for(int i=0;i<N;i++) {
			int count = 0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i] % j == 0) {
					count++;
				}
			}
			if(count == 2)
				result++;
		}
		System.out.println(result);
	}
}