import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<t; i++) {
            String s = sc.nextLine();
            int score = 0;
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    count++;
                    score += count;
                } else if (s.charAt(j) == 'X') {
                    count = 0;
                }
            }
            System.out.print(score + "\n");
        }
    }
}
