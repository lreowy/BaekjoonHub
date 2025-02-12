import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int L = sc.nextInt();
		String s = sc.next();
		
		long sum = 0;
		double r = 0;
		r = Math.pow(31, 0);
		for(int i=0;i<L;i++) {
			for(int j=0;j<arr.length;j++) {
				if(s.charAt(i) == arr[j]) {
					sum += (j+1) * r; 
					r = r * 31 % 1234567891; //수동으로 31 곱하고 mod 연산
				}
			}
		}
		System.out.println(sum % 1234567891);	
	}
}