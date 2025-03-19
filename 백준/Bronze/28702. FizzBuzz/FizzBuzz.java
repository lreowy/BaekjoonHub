import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[] s = new String[3];
		int ans = 0;
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine());
			s[i] = st.nextToken();
			if(s[i].equals("Fizz"))
				continue;
			else if(s[i].equals("Buzz"))
				continue;
			else if(s[i].equals("FizzBuzz"))
				continue;
			else {
				int n = Integer.parseInt(s[i]);
				ans = 0;
				if(i == 0) {
					ans = n+3;
				} else if(i==1) {
					ans = n+2;
				} else if(i==2) {
					ans = n+1;
				}
			}
		}
		String result = "";
		if(ans % 15 == 0) {
			result = "FizzBuzz";
			System.out.println(result);
		} else if(ans % 5 == 0) {
			result = "Buzz";
			System.out.println(result);
		} else if(ans % 3 ==0) {
			result = "Fizz";
			System.out.println(result);
		} else {
			System.out.println(ans);
		}
	}
}