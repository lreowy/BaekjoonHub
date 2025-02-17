import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] a = new int[N];
			int[] b = new int[M];
 			for(int i=0;i<N;i++) {
				a[i] = sc.nextInt();
			}
 			
 			for(int i =0;i<M;i++) {
 				b[i] = sc.nextInt();
 			}
 			
 			int max = 0;
 			int sum = 0;
 			if(N>=M) {
 				for(int i=0;i<N-M+1;i++) {
 					for(int j=0;j<M;j++) {
 						sum += a[i+j] * b[j];
 					}
 					if(max <= sum)
 						max = sum;
 					sum = 0;
 				}
 			}
 			else {
 				for(int i=0;i<M-N+1;i++) {
 					for(int j=0;j<N;j++) {
 						sum += a[j] * b[i+j];
 					}
 					if(max <= sum)
 						max = sum;
 					sum = 0;
 				}
 			}
 			System.out.println("#" + tc + " " + max);
		}
	}
}
