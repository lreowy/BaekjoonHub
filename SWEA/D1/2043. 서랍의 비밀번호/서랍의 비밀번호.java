import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 1;
		while(P != K) {
			K++;
			count++;
		}
		
		System.out.println(count);
	}
}