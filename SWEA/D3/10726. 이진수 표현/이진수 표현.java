import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			boolean isOn = true;
			String s = Integer.toBinaryString(M);
			if (s.length() >= N) {
				for (int i = s.length() - N; i < s.length(); i++) {
					if (s.charAt(i) != '1')
						isOn = false;
				}
			} else {
				isOn = false;
			}
			if (isOn == true)
				System.out.println("#" + tc + " ON");
			else {
				System.out.println("#" + tc + " OFF");
			}
		}
	}
}
