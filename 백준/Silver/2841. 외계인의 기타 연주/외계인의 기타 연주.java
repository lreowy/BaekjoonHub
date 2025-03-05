import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
 		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		Stack<Integer>[] s = new Stack[7];
		for(int i=0;i<7;i++) {
			s[i] = new Stack<>();
		}
		int count = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int line = Integer.parseInt(st.nextToken());
			int fret = Integer.parseInt(st.nextToken());
			
			while(!s[line].isEmpty()) {
				if(s[line].peek() < fret) {
					s[line].push(fret);
					count++;
				} else if(s[line].peek() > fret) {
					s[line].pop();
					count++;
				} else {
					break;
				}
			}
			
			if(s[line].isEmpty()) {
				s[line].push(fret);
				count++;
			}
			
		}
		System.out.println(count);
	}
}