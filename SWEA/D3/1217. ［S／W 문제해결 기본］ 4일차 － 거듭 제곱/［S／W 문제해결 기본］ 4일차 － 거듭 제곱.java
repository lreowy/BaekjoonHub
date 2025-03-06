import java.util.Scanner;

public class Solution {
	
	static int val;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc<=10; tc++) {
			int t = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = recur(a, b);
			System.out.println("#" + tc +" " + ans);
		}
	}
	
	public static int recur(int a, int b) {
		val = 1;
		if(b==1)
			return val * a;
		val = recur(a, b-1);
		return val * a;
	}
}