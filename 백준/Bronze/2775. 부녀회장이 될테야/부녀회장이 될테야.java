import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int apt[][] = new int[15][15];
		
		for(int j=0;j<15;j++) {
			apt[j][1] = 1;
			apt[0][j] = j;
		}
		
		for(int l=1;l<15;l++) {
			for(int m=2;m<15;m++) {
				apt[l][m] = apt[l][m-1] + apt[l-1][m];
			}
		}
		for(int i=0;i<t;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(apt[k][n]);
		}
	}
}
