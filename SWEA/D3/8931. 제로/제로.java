import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			Stack<Integer> stack = new Stack<>();
			int test = sc.nextInt();
			for (int i = 0; i < test; i++) {
				int input = sc.nextInt();
				if (input == 0)
					stack.pop();
				else {
					stack.add(input);
				}
			}

			int sum = 0;
			while (!stack.isEmpty()) {
				if(stack.isEmpty())
					break;
				sum += stack.pop();
			}
			System.out.println("#" + t + " " + sum);
		}
	}
}
