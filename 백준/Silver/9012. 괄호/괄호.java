import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			String s = sc.next();
			Stack<Character> st = new Stack<>();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j) == '(')
					st.push(s.charAt(j));
				else if(s.charAt(j) == ')') {
					if(st.isEmpty())
						st.push(s.charAt(j));
					else {
						if(st.peek() == '(')
							st.pop();
						else
							st.push(s.charAt(j));
					}
				}
			}
			
			if(st.isEmpty()){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}