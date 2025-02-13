import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int length = sc.nextInt();
			String s = sc.next();
			Stack<Character> st = new Stack<>();
			boolean isOk = true;
			for (int i = 0; i < length; i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '<') {
					st.push(s.charAt(i));
				} else {
					if (st.isEmpty()) {
						isOk = false;
						break;
					} else {
						char c = st.pop();
						switch (s.charAt(i)) {
						case ')':
							if (c != '(')
								isOk = false;
							break;
						case ']':
							if (c != '[')
								isOk = false;
							break;
						case '}':
							if (c != '{')
								isOk = false;
							break;
						case '>':
							if (c != '<')
								isOk = false;
							break;
						}
					}
				}
			}
			int result = 0;
			if (st.isEmpty() && isOk)
				result = 1;
			else {
				result = 0;
			}
			System.out.println("#" + test_case + " " + result);
		}
	}
}