import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1;tc<=T;tc++) {
			int N = sc.nextInt();
			int sum = 0;
			for(int i = 1; i<=N;i++) {
				if(i % 2 == 1)
					sum += i;
				else {
					sum -= i;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}