import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T;test_case++) {
			Stack<Character> st = new Stack<>();
			String s = sc.next();
			int sum = 0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == '(') {
					st.push(s.charAt(i));
				}
				else {
					st.pop();
					if(s.charAt(i-1) == '(') {
						sum += st.size();
					} else {
						sum += 1;
					}
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}