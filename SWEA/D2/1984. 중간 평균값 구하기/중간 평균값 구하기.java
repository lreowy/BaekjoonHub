import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			int[] arr = new int[10];
			int max = 0;
			int min = 10001;
			int sum = 0;
			for(int i=0;i<10;i++) {
				arr[i] = sc.nextInt();
				if(max <= arr[i])
					max = arr[i];
				if(min >= arr[i])
					min = arr[i];
				sum += arr[i];
			}
			double avg = (double)(sum - max - min) / 8;
			System.out.println("#" + tc + " " + Math.round(avg));
		}
	}
}