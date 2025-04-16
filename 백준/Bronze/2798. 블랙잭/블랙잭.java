import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M, ans, sum;
	static int[] cards, pick;
	static boolean[] visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); //카드 개수
		M = Integer.parseInt(st.nextToken()); //블랙잭 숫자
		cards = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		visited = new boolean[N];
		pick = new int[3];
		ans = 0;
		sum = 0;
		pickCard(0);
		System.out.println(ans);
	}
	
	static void pickCard(int idx) {
		if(idx == 3) {
			sum = 0;
			for(int i=0;i<pick.length;i++) {
				sum += pick[i];
			}
			if(ans <= sum && sum <= M) {
				ans = sum;
			}
			return;
		}
		for(int i=0;i<N;i++) {
			if(visited[i])
				continue;
			visited[i] = true;
			pick[idx] = cards[i];
			pickCard(idx + 1);
			visited[i] = false;
		}
	}
}
