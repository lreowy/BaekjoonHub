import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			map1.put(i, s);
			map2.put(s, i);
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			if(input.charAt(0) - 65 >= 0) {
				sb.append(map2.get(input) + "\n");
			} else if(input.charAt(0) - 65 < 0) {
				sb.append(map1.get(Integer.parseInt(input)) + "\n");
			}
		}
		System.out.println(sb);
	}
}
