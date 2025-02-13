import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.next();
			if(input.equals("0"))
				break;
			StringBuilder sb = new StringBuilder();
			sb.append(input);
			sb.reverse();
			
			boolean isPal = true;
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i) != sb.charAt(i))
					isPal =false;
			}
			if(isPal)
				System.out.println("yes");
			else {
				System.out.println("no");
			}
		}
	}
}
