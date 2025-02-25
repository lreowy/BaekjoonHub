import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			String s = sc.next();
			int test = Integer.parseInt(s);
			int year = test / 10000;
			int month = (test % 10000) / 100;
			int day = test % 100;
			boolean isValid = true;
			if(month < 1 || month > 12)
				isValid = false;
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if(day > 31 || day < 1)
					isValid = false;
			} else if(month == 4 || month ==6 || month == 9 || month == 11) {
				if(day > 30 || day < 1)
					isValid = false;
			} else {
				if(day > 28 || day < 1)
					isValid = false;
			}
			StringBuilder sb = new StringBuilder();
			sb.append(s, 0, 4);
			sb.append("/");
			sb.append(s, 4, 6);
			sb.append("/");
			sb.append(s, 6, s.length());
			if(isValid) 
				System.out.println("#" + tc + " " + sb.toString());
			else
				System.out.println("#" + tc + " -1" );
		}
	}
}