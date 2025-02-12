import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case = 0;test_case<10;test_case++) {
			int num = sc.nextInt();
			String target = sc.next();
			String s = sc.next();
			
			int count = 0;
			for(int i=0;i<s.length()-target.length()+1;i++) {
				boolean isEqual = true;
				for(int j=0;j<target.length();j++) {
					if(s.charAt(i+j) != target.charAt(j)) {
						isEqual = false;
					}	
				}
				if(isEqual)
					count++;
			}
			System.out.println("#" + num + " " + count);
		}
	}
}