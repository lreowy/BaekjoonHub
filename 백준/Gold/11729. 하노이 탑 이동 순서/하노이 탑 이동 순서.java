import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		System.out.println((1<<n) - 1);
		move(1, 3, n);
		System.out.println(sb);
	}

	public static void move(int a, int b, int n) {
		if (n == 1) {
			sb.append(a + " " + b + "\n");
			return;
		}
		move(a, 6-a-b, n-1);
		sb.append(a + " " + b + "\n");
		move(6-a-b, b, n-1);
	}
}