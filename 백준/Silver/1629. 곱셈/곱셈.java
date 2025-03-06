import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long val;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println(recur(a, b, c));
	}
	
	public static long recur(int a, int b, int c) {
		val = 1;
		if(b == 1) {
			return a % c;
		}
		val = recur(a, b/2, c);
		
		if(b % 2 == 1) {
			return (val * val % c) * a % c;
		}
		return val * val % c;
	}
}